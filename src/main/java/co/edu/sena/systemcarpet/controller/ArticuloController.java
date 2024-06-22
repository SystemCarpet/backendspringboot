package co.edu.sena.systemcarpet.controller;

import co.edu.sena.systemcarpet.model.inventario.articulos.Articulo;
import co.edu.sena.systemcarpet.model.inventario.productos.Producto;
import co.edu.sena.systemcarpet.service.ArticuloService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/articulos")
public class ArticuloController {

    private final ArticuloService articuloService;


    public ArticuloController(ArticuloService articuloService) {
        this.articuloService = articuloService;
    }

    @GetMapping
    public List<Articulo> getAllArticulos() {
        return articuloService.getAllArticulos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Articulo> getArticuloById(@PathVariable("id") Integer id) {
        Optional<Articulo> articulo = articuloService.getArticuloById(id);
        return articulo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/add")
    public ResponseEntity<Articulo> addArticulo(@RequestBody Articulo articulo) {
        Optional<Articulo> newArticulo = articuloService.addArticulo(articulo);
        return newArticulo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.badRequest().build());
    }

    @PatchMapping("/{id}/update")
    public ResponseEntity<Articulo> updateArticulo(@RequestBody Articulo articulo, @PathVariable Integer id) {
        Optional<Integer> updatedId = articuloService.updateArticulo(articulo);
        if (updatedId.isPresent()) {
            Optional<Articulo> updatedArticulo = articuloService.getArticuloById(updatedId.get());
            return updatedArticulo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}/delete")
    public ResponseEntity<Articulo> deleteArticuloById(@PathVariable("id") Integer id) {
        Optional<Articulo> deletedArticulo = Optional.empty();
        if (articuloService.existsById(id)) {
            deletedArticulo = articuloService.getArticuloById(id);
            articuloService.deleteArticuloById(id);
        }
        return deletedArticulo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}

