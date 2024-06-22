package co.edu.sena.systemcarpet.service;

import co.edu.sena.systemcarpet.model.inventario.productos.infovehiculo.ModeloVehiculo;
import co.edu.sena.systemcarpet.repository.IModeloVehiculoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModeloVehiculoService {

    private final IModeloVehiculoRepository modeloVehiculoRepository;

    public ModeloVehiculoService(IModeloVehiculoRepository modeloVehiculoRepository) {
        this.modeloVehiculoRepository = modeloVehiculoRepository;
    }

    //R
    public List<ModeloVehiculo> getAllModeloVehiculos() {
        return modeloVehiculoRepository.findAll();
    }

    //R
    public Optional<ModeloVehiculo> getModeloVehiculoById(Integer id) {
        return modeloVehiculoRepository.findById(id);
    }

    //R
    public boolean existsById(Integer id) {
        return modeloVehiculoRepository.existsById(id);
    }

    //D
    public boolean deleteModeloVehiculoById(Integer id) {
        if(modeloVehiculoRepository.findById(id).isPresent()) {
            modeloVehiculoRepository.deleteById(id);
            return true;
        }
        return false;
    }

    //C
    public Optional<ModeloVehiculo> addModeloVehiculo(ModeloVehiculo modeloVehiculo) {
        if (modeloVehiculoRepository.findById(modeloVehiculo.getIdModeloVehiculo()).isEmpty()) {
            modeloVehiculoRepository.save(modeloVehiculo);
            return Optional.of(modeloVehiculo);
        }
        return Optional.empty();
    }

    //U
    public Optional<Integer> updateModeloVehiculo(ModeloVehiculo modeloVehiculo) {
        if (existsById(modeloVehiculo.getIdModeloVehiculo())) {
            return Optional.of(this.modeloVehiculoRepository.save(modeloVehiculo).getIdModeloVehiculo());
        }
        return Optional.empty();
    }
}