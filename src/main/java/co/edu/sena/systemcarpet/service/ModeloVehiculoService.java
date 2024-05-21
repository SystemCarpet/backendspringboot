package co.edu.sena.systemcarpet.service;

import co.edu.sena.systemcarpet.entities.ModeloVehiculo;
import co.edu.sena.systemcarpet.repositories.ModeloVehiculoRepository;
import co.edu.sena.systemcarpet.service.daoServices.DaoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModeloVehiculoService implements DaoServices<ModeloVehiculo, Long> {

    @Autowired
    private ModeloVehiculoRepository modeloVehiculoRepository;
    @Override
    public List<ModeloVehiculo> fAll() {
        return this.modeloVehiculoRepository.findAll();
    }

    @Override
    public ModeloVehiculo fById(Long id) {
        return this.modeloVehiculoRepository.getById(id);
    }

    @Override
    public int save(ModeloVehiculo obje) {
        this.modeloVehiculoRepository.save(obje);
        return 1;
    }

    @Override
    public int delete(ModeloVehiculo obje) {
        this.modeloVehiculoRepository.delete(obje);
        return 1;
    }

    @Override
    public int update(ModeloVehiculo obje) {
        return 0;
    }
}
