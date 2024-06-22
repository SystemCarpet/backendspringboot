package co.edu.sena.systemcarpet.controller;

import co.edu.sena.systemcarpet.model.inventario.productos.infovehiculo.TipoVehiculo;
import co.edu.sena.systemcarpet.service.TipoVehiculoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/tipos-vehiculos")
public class TipoVehiculoController {

    private final TipoVehiculoService tipoVehiculoService;

    @Autowired
    public TipoVehiculoController(TipoVehiculoService tipoVehiculoService) {
        this.tipoVehiculoService = tipoVehiculoService;
    }

    @GetMapping
    public List<TipoVehiculo> getAllTiposVehiculos() {
        return tipoVehiculoService.getAllTipoVehiculos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoVehiculo> getTipoVehiculoById(@PathVariable("id") Integer id) {
        Optional<TipoVehiculo> tipoVehiculo = tipoVehiculoService.getTipoVehiculoById(id);
        return tipoVehiculo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/add")
    public ResponseEntity<TipoVehiculo> addTipoVehiculo(@RequestBody TipoVehiculo tipoVehiculo) {
        Optional<TipoVehiculo> newTipoVehiculo = tipoVehiculoService.addTipoVehiculo(tipoVehiculo);
        return newTipoVehiculo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.badRequest().build());
    }

    @PatchMapping("/{id}/update")
    public ResponseEntity<TipoVehiculo> updateTipoVehiculo(@RequestBody TipoVehiculo tipoVehiculo, @PathVariable Integer id) {
        Optional<Integer> updatedId = tipoVehiculoService.updateTipoVehiculo(tipoVehiculo);
        if (updatedId.isPresent()) {
            Optional<TipoVehiculo> updatedTipoVehiculo = tipoVehiculoService.getTipoVehiculoById(updatedId.get());
            return updatedTipoVehiculo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}/delete")
    public ResponseEntity<TipoVehiculo> deleteTipoVehiculoById(@PathVariable("id") Integer id) {
        Optional<TipoVehiculo> deletedTipoVehiculo = Optional.empty();
        if (tipoVehiculoService.existsById(id)) {
            deletedTipoVehiculo = tipoVehiculoService.getTipoVehiculoById(id);
            tipoVehiculoService.deleteTipoVehiculoById(id);
        }
        return deletedTipoVehiculo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}

