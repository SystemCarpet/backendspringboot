package co.edu.sena.systemcarpet.service;

import co.edu.sena.systemcarpet.model.inventario.articulos.TiposArticulo;
import co.edu.sena.systemcarpet.repository.ITiposArticuloRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TiposArticuloService {

    private final ITiposArticuloRepository tiposArticuloRepository;

    public TiposArticuloService(ITiposArticuloRepository tiposArticuloRepository) {
        this.tiposArticuloRepository = tiposArticuloRepository;
    }

    //R
    public List<TiposArticulo> getAllTiposArticulos() {
        return tiposArticuloRepository.findAll();
    }

    //R
    public Optional<TiposArticulo> getTiposArticuloById(Integer id) {
        return tiposArticuloRepository.findById(id);
    }

    //R
    public boolean existsById(Integer id) {
        return tiposArticuloRepository.existsById(id);
    }

    //D
    public boolean deleteTiposArticuloById(Integer id) {
        if(tiposArticuloRepository.findById(id).isPresent()) {
            tiposArticuloRepository.deleteById(id);
            return true;
        }
        return false;
    }

    //C
    public Optional<TiposArticulo> addTiposArticulo(TiposArticulo tiposArticulo) {
        if (tiposArticuloRepository.findById(tiposArticulo.getIdTipoArticulo()).isEmpty()) {
            tiposArticuloRepository.save(tiposArticulo);
            return Optional.of(tiposArticulo);
        }
        return Optional.empty();
    }

    //U
    public Optional<Integer> updateTiposArticulo(TiposArticulo tiposArticulo) {
        if (existsById(tiposArticulo.getIdTipoArticulo())) {
            return Optional.of(this.tiposArticuloRepository.save(tiposArticulo).getIdTipoArticulo());
        }
        return Optional.empty();
    }
}
