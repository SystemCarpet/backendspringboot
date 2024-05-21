package co.edu.sena.systemcarpet.service;

import co.edu.sena.systemcarpet.entities.MarcaVehiculo;
import co.edu.sena.systemcarpet.repositories.MarcaVehiculoRepository;
import co.edu.sena.systemcarpet.service.daoServices.DaoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaVehiculoService implements DaoServices<MarcaVehiculo, Long> {

    @Autowired
    private MarcaVehiculoRepository marcaVehiculoRepository;
    @Override
    public List<MarcaVehiculo> fAll() {

        return this.marcaVehiculoRepository.findAll();
    }

    @Override
    public MarcaVehiculo fById(Long id) {
        return this.marcaVehiculoRepository.getById(id);
    }

    @Override
    public int save(MarcaVehiculo obje) {
        this.marcaVehiculoRepository.save(obje);
        return 1;
    }

    @Override
    public int delete(MarcaVehiculo obje) {
        this.marcaVehiculoRepository.delete(obje);
        return 1;
    }

    @Override
    public int update(MarcaVehiculo obje){
        this.marcaVehiculoRepository.save(obje);
        return 1;
    }


}
