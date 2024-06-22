package co.edu.sena.systemcarpet.controller;

import co.edu.sena.systemcarpet.model.inventario.productos.infovehiculo.ModeloVehiculo;
import co.edu.sena.systemcarpet.service.ModeloVehiculoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/modelos-vehiculos")
public class ModeloVehiculoController {

    private final ModeloVehiculoService modeloVehiculoService;


    public ModeloVehiculoController(ModeloVehiculoService modeloVehiculoService) {
        this.modeloVehiculoService = modeloVehiculoService;
    }

    @GetMapping
    public List<ModeloVehiculo> getAllModelosVehiculos() {
        return modeloVehiculoService.getAllModeloVehiculos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ModeloVehiculo> getModeloVehiculoById(@PathVariable("id") Integer id) {
        Optional<ModeloVehiculo> modeloVehiculo = modeloVehiculoService.getModeloVehiculoById(id);
        return modeloVehiculo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/add")
    public ResponseEntity<ModeloVehiculo> addModeloVehiculo(@RequestBody ModeloVehiculo modeloVehiculo) {
        Optional<ModeloVehiculo> newModeloVehiculo = modeloVehiculoService.addModeloVehiculo(modeloVehiculo);
        return newModeloVehiculo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.badRequest().build());
    }

    @PatchMapping("/{id}/update")
    public ResponseEntity<ModeloVehiculo> updateModeloVehiculo(@RequestBody ModeloVehiculo modeloVehiculo, @PathVariable Integer id) {
        Optional<Integer> updatedId = modeloVehiculoService.updateModeloVehiculo(modeloVehiculo);
        if (updatedId.isPresent()) {
            Optional<ModeloVehiculo> updatedModeloVehiculo = modeloVehiculoService.getModeloVehiculoById(updatedId.get());
            return updatedModeloVehiculo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}/delete")
    public ResponseEntity<ModeloVehiculo> deleteModeloVehiculoById(@PathVariable("id") Integer id) {
        Optional<ModeloVehiculo> deletedModeloVehiculo = Optional.empty();
        if (modeloVehiculoService.existsById(id)) {
            deletedModeloVehiculo = modeloVehiculoService.getModeloVehiculoById(id);
            modeloVehiculoService.deleteModeloVehiculoById(id);
        }
        return deletedModeloVehiculo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
