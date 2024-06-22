package co.edu.sena.systemcarpet.controller;

import co.edu.sena.systemcarpet.model.inventario.productos.Categoria;
import co.edu.sena.systemcarpet.service.CategoriaService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/categorias")
public class CategoriaController {

    private final CategoriaService categoriaService;


    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping
    public List<Categoria> getAllCategorias() {
        return categoriaService.getAllCategorias();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categoria> getCategoriaById(@PathVariable("id") Integer id) {
        Optional<Categoria> categoria = categoriaService.getCategoriaById(id);
        return categoria.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/add")
    public ResponseEntity<Categoria> addCategoria(@RequestBody Categoria categoria) {
        Optional<Categoria> newCategoria = categoriaService.addCategoria(categoria);
        return newCategoria.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.badRequest().build());
    }

    @PatchMapping("/{id}/update")
    public ResponseEntity<Categoria> updateCategoria(@RequestBody Categoria categoria, @PathVariable Integer id) {
        Optional<Integer> updatedId = categoriaService.updateCategoria(categoria);
        if (updatedId.isPresent()) {
            Optional<Categoria> updatedCategoria = categoriaService.getCategoriaById(updatedId.get());
            return updatedCategoria.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}/delete")
    public ResponseEntity<Categoria> deleteCategoriaById(@PathVariable("id") Integer id) {
        Optional<Categoria> deletedCategoria = Optional.empty();
        if (categoriaService.existsById(id)) {
            deletedCategoria = categoriaService.getCategoriaById(id);
            categoriaService.deleteCategoriaById(id);
        }
        return deletedCategoria.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
