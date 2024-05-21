package co.edu.sena.systemcarpet.service;

import co.edu.sena.systemcarpet.entities.TipoVehiculo;
import co.edu.sena.systemcarpet.repositories.TipoVehiculoRepository;
import co.edu.sena.systemcarpet.service.daoServices.DaoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoVehiculoService implements DaoServices<TipoVehiculo, Long> {

    @Autowired
    private TipoVehiculoRepository tipoVehiculoRepository;
    @Override
    public List<TipoVehiculo> fAll() {
        return this.tipoVehiculoRepository.findAll();
    }

    @Override
    public TipoVehiculo fById(Long id) {
        return this.tipoVehiculoRepository.getById(id);
    }

    @Override
    public int save(TipoVehiculo obje) {
        this.tipoVehiculoRepository.save(obje);
        return 1;
    }

    @Override
    public int delete(TipoVehiculo obje) {
        this.tipoVehiculoRepository.delete(obje);
        return 1;
    }

    @Override
    public int update(TipoVehiculo obje) {
        return 0;
    }
}
