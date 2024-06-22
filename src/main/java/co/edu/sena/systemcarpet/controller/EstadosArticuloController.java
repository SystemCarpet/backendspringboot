package co.edu.sena.systemcarpet.controller;

import co.edu.sena.systemcarpet.model.inventario.articulos.EstadosArticulo;
import co.edu.sena.systemcarpet.service.EstadosArticuloService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/estados-articulos")
public class EstadosArticuloController {

    private final EstadosArticuloService estadosArticuloService;


    public EstadosArticuloController(EstadosArticuloService estadosArticuloService) {
        this.estadosArticuloService = estadosArticuloService;
    }

    @GetMapping
    public List<EstadosArticulo> getAllEstadosArticulos() {
        return estadosArticuloService.getAllEstadosArticulos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EstadosArticulo> getEstadosArticuloById(@PathVariable("id") Integer id) {
        Optional<EstadosArticulo> estadosArticulo = estadosArticuloService.getEstadosArticuloById(id);
        return estadosArticulo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/add")
    public ResponseEntity<EstadosArticulo> addEstadosArticulo(@RequestBody EstadosArticulo estadosArticulo) {
        Optional<EstadosArticulo> newEstadosArticulo = estadosArticuloService.addEstadosArticulo(estadosArticulo);
        return newEstadosArticulo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.badRequest().build());
    }

    @PatchMapping("/{id}/update")
    public ResponseEntity<EstadosArticulo> updateEstadosArticulo(@RequestBody EstadosArticulo estadosArticulo, @PathVariable Integer id) {
        Optional<Integer> updatedId = estadosArticuloService.updateEstadosArticulo(estadosArticulo);
        if (updatedId.isPresent()) {
            Optional<EstadosArticulo> updatedEstadosArticulo = estadosArticuloService.getEstadosArticuloById(updatedId.get());
            return updatedEstadosArticulo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}/delete")
    public ResponseEntity<EstadosArticulo> deleteEstadosArticuloById(@PathVariable("id") Integer id) {
        Optional<EstadosArticulo> deletedEstadosArticulo = Optional.empty();
        if (estadosArticuloService.existsById(id)) {
            deletedEstadosArticulo = estadosArticuloService.getEstadosArticuloById(id);
            estadosArticuloService.deleteEstadosArticuloById(id);
        }
        return deletedEstadosArticulo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
