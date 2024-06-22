package co.edu.sena.systemcarpet.service;

import co.edu.sena.systemcarpet.model.inventario.articulos.EstadosArticulo;
import co.edu.sena.systemcarpet.repository.IEstadosArticuloRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EstadosArticuloService {

    private final IEstadosArticuloRepository estadosArticuloRepository;

    public EstadosArticuloService(IEstadosArticuloRepository estadosArticuloRepository) {
        this.estadosArticuloRepository = estadosArticuloRepository;
    }

    //R
    public List<EstadosArticulo> getAllEstadosArticulos() {
        return estadosArticuloRepository.findAll();
    }

    //R
    public Optional<EstadosArticulo> getEstadosArticuloById(Integer id) {
        return estadosArticuloRepository.findById(id);
    }

    //R
    public boolean existsById(Integer id) {
        return estadosArticuloRepository.existsById(id);
    }

    //D
    public boolean deleteEstadosArticuloById(Integer id) {
        if(estadosArticuloRepository.findById(id).isPresent()) {
            estadosArticuloRepository.deleteById(id);
            return true;
        }
        return false;
    }

    //C
    public Optional<EstadosArticulo> addEstadosArticulo(EstadosArticulo estadosArticulo) {
        if (estadosArticuloRepository.findById(estadosArticulo.getIdEstadoArticulo()).isEmpty()) {
            estadosArticuloRepository.save(estadosArticulo);
            return Optional.of(estadosArticulo);
        }
        return Optional.empty();
    }

    //U
    public Optional<Integer> updateEstadosArticulo(EstadosArticulo estadosArticulo) {
        if (existsById(estadosArticulo.getIdEstadoArticulo())) {
            return Optional.of(this.estadosArticuloRepository.save(estadosArticulo).getIdEstadoArticulo());
        }
        return Optional.empty();
    }
}
