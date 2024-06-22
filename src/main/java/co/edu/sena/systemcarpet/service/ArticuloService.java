package co.edu.sena.systemcarpet.service;
import co.edu.sena.systemcarpet.model.inventario.articulos.Articulo;
import co.edu.sena.systemcarpet.repository.IArticuloRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticuloService {

    private final IArticuloRepository articuloRepository;

    public ArticuloService(IArticuloRepository articuloRepository) {
        this.articuloRepository = articuloRepository;
    }

    //R
    public List<Articulo> getAllArticulos() {
        return articuloRepository.findAll();
    }

    //R
    public Optional<Articulo> getArticuloById(Integer id) {
        return articuloRepository.findById(id);
    }

    //R
    public boolean existsById(Integer id) {
        return articuloRepository.existsById(id);
    }

    //D
    public boolean deleteArticuloById(Integer id) {
        if(articuloRepository.findById(id).isPresent()) {
            articuloRepository.deleteById(id);
            return true;
        }
        return false;
    }

    //C
    public Optional<Articulo> addArticulo(Articulo articulo) {
        if (articuloRepository.findById(articulo.getIdArticulo()).isEmpty()) {
            articuloRepository.save(articulo);
            return Optional.of(articulo);
        }
        return Optional.empty();
    }

    //U
    public Optional<Integer> updateArticulo(Articulo articulo) {
        if (existsById(articulo.getIdArticulo())) {
            return Optional.of(this.articuloRepository.save(articulo).getIdArticulo());
        }
        return Optional.empty();
    }
}

