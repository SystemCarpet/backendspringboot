package co.edu.sena.systemcarpet.service;
import co.edu.sena.systemcarpet.model.inventario.productos.infovehiculo.MarcaVehiculo;
import co.edu.sena.systemcarpet.repository.IMarcaVehiculoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MarcaVehiculoService {

    private final IMarcaVehiculoRepository marcaVehiculoRepository;

    public MarcaVehiculoService(IMarcaVehiculoRepository marcaVehiculoRepository) {
        this.marcaVehiculoRepository = marcaVehiculoRepository;
    }

    //R
    public List<MarcaVehiculo> getAllMarcaVehiculos() {
        return marcaVehiculoRepository.findAll();
    }

    //R
    public Optional<MarcaVehiculo> getMarcaVehiculoById(Integer id) {
        return marcaVehiculoRepository.findById(id);
    }

    //R
    public boolean existsById(Integer id) {
        return marcaVehiculoRepository.existsById(id);
    }

    //D
    public boolean deleteMarcaVehiculoById(Integer id) {
        if(marcaVehiculoRepository.findById(id).isPresent()) {
            marcaVehiculoRepository.deleteById(id);
            return true;
        }
        return false;
    }

    //C
    public Optional<MarcaVehiculo> addMarcaVehiculo(MarcaVehiculo marcaVehiculo) {
        if (marcaVehiculoRepository.findById(marcaVehiculo.getIdMarcaVehiculo()).isEmpty()) {
            marcaVehiculoRepository.save(marcaVehiculo);
            return Optional.of(marcaVehiculo);
        }
        return Optional.empty();
    }

    //U
    public Optional<Integer> updateMarcaVehiculo(MarcaVehiculo marcaVehiculo) {
        if (existsById(marcaVehiculo.getIdMarcaVehiculo())) {
            return Optional.of(this.marcaVehiculoRepository.save(marcaVehiculo).getIdMarcaVehiculo());
        }
        return Optional.empty();
    }
}
