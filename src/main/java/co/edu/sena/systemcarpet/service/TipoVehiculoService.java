package co.edu.sena.systemcarpet.service;


import co.edu.sena.systemcarpet.model.inventario.productos.infovehiculo.TipoVehiculo;
import co.edu.sena.systemcarpet.repository.ITipoVehiculoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoVehiculoService {

    private final ITipoVehiculoRepository tipoVehiculoRepository;

    public TipoVehiculoService(ITipoVehiculoRepository tipoVehiculoRepository) {
        this.tipoVehiculoRepository = tipoVehiculoRepository;
    }

    //R
    public List<TipoVehiculo> getAllTipoVehiculos() {
        return tipoVehiculoRepository.findAll();
    }

    //R
    public Optional<TipoVehiculo> getTipoVehiculoById(Integer id) {
        return tipoVehiculoRepository.findById(id);
    }

    //R
    public boolean existsById(Integer id) {
        return tipoVehiculoRepository.existsById(id);
    }

    //D
    public boolean deleteTipoVehiculoById(Integer id) {
        if(tipoVehiculoRepository.findById(id).isPresent()) {
            tipoVehiculoRepository.deleteById(id);
            return true;
        }
        return false;
    }

    //C
    public Optional<TipoVehiculo> addTipoVehiculo(TipoVehiculo tipoVehiculo) {
        if (tipoVehiculoRepository.findById(tipoVehiculo.getIdTipoVehiculo()).isEmpty()) {
            tipoVehiculoRepository.save(tipoVehiculo);
            return Optional.of(tipoVehiculo);
        }
        return Optional.empty();
    }

    //U
    public Optional<Integer> updateTipoVehiculo(TipoVehiculo tipoVehiculo) {
        if (existsById(tipoVehiculo.getIdTipoVehiculo())) {
            return Optional.of(this.tipoVehiculoRepository.save(tipoVehiculo).getIdTipoVehiculo());
        }
        return Optional.empty();
    }
}
