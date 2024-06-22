package co.edu.sena.systemcarpet.controller;

import co.edu.sena.systemcarpet.model.inventario.productos.infovehiculo.MarcaVehiculo;
import co.edu.sena.systemcarpet.service.MarcaVehiculoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/marcas-vehiculos")
public class MarcaVehiculoController {

    private final MarcaVehiculoService marcaVehiculoService;


    public MarcaVehiculoController(MarcaVehiculoService marcaVehiculoService) {
        this.marcaVehiculoService = marcaVehiculoService;
    }

    @GetMapping
    public List<MarcaVehiculo> getAllMarcasVehiculos() {
        return marcaVehiculoService.getAllMarcaVehiculos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MarcaVehiculo> getMarcaVehiculoById(@PathVariable("id") Integer id) {
        Optional<MarcaVehiculo> marcaVehiculo = marcaVehiculoService.getMarcaVehiculoById(id);
        return marcaVehiculo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/add")
    public ResponseEntity<MarcaVehiculo> addMarcaVehiculo(@RequestBody MarcaVehiculo marcaVehiculo) {
        Optional<MarcaVehiculo> newMarcaVehiculo = marcaVehiculoService.addMarcaVehiculo(marcaVehiculo);
        return newMarcaVehiculo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.badRequest().build());
    }

    @PatchMapping("/{id}/update")
    public ResponseEntity<MarcaVehiculo> updateMarcaVehiculo(@RequestBody MarcaVehiculo marcaVehiculo, @PathVariable Integer id) {
        Optional<Integer> updatedId = marcaVehiculoService.updateMarcaVehiculo(marcaVehiculo);
        if (updatedId.isPresent()) {
            Optional<MarcaVehiculo> updatedMarcaVehiculo = marcaVehiculoService.getMarcaVehiculoById(updatedId.get());
            return updatedMarcaVehiculo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}/delete")
    public ResponseEntity<MarcaVehiculo> deleteMarcaVehiculoById(@PathVariable("id") Integer id) {
        Optional<MarcaVehiculo> deletedMarcaVehiculo = Optional.empty();
        if (marcaVehiculoService.existsById(id)) {
            deletedMarcaVehiculo = marcaVehiculoService.getMarcaVehiculoById(id);
            marcaVehiculoService.deleteMarcaVehiculoById(id);
        }
        return deletedMarcaVehiculo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}

