package co.edu.sena.systemcarpet.controller;

import co.edu.sena.systemcarpet.model.inventario.articulos.TiposArticulo;
import co.edu.sena.systemcarpet.service.TiposArticuloService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/tipos-articulos")
public class TiposArticuloController {

    private final TiposArticuloService tiposArticuloService;


    public TiposArticuloController(TiposArticuloService tiposArticuloService) {
        this.tiposArticuloService = tiposArticuloService;
    }

    @GetMapping
    public List<TiposArticulo> getAllTiposArticulos() {
        return tiposArticuloService.getAllTiposArticulos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TiposArticulo> getTiposArticuloById(@PathVariable("id") Integer id) {
        Optional<TiposArticulo> tiposArticulo = tiposArticuloService.getTiposArticuloById(id);
        return tiposArticulo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/add")
    public ResponseEntity<TiposArticulo> addTiposArticulo(@RequestBody TiposArticulo tiposArticulo) {
        Optional<TiposArticulo> newTiposArticulo = tiposArticuloService.addTiposArticulo(tiposArticulo);
        return newTiposArticulo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.badRequest().build());
    }

    @PatchMapping("/{id}/update")
    public ResponseEntity<TiposArticulo> updateTiposArticulo(@RequestBody TiposArticulo tiposArticulo, @PathVariable Integer id) {
        Optional<Integer> updatedId = tiposArticuloService.updateTiposArticulo(tiposArticulo);
        if (updatedId.isPresent()) {
            Optional<TiposArticulo> updatedTiposArticulo = tiposArticuloService.getTiposArticuloById(updatedId.get());
            return updatedTiposArticulo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}/delete")
    public ResponseEntity<TiposArticulo> deleteTiposArticuloById(@PathVariable("id") Integer id) {
        Optional<TiposArticulo> deletedTiposArticulo = Optional.empty();
        if (tiposArticuloService.existsById(id)) {
            deletedTiposArticulo = tiposArticuloService.getTiposArticuloById(id);
            tiposArticuloService.deleteTiposArticuloById(id);
        }
        return deletedTiposArticulo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
