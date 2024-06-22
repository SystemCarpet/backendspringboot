package co.edu.sena.systemcarpet.service;
import co.edu.sena.systemcarpet.model.inventario.productos.Categoria;
import co.edu.sena.systemcarpet.repository.ICategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    private final ICategoriaRepository categoriaRepository;

    public CategoriaService(ICategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    //R
    public List<Categoria> getAllCategorias() {
        return categoriaRepository.findAll();
    }

    //R
    public Optional<Categoria> getCategoriaById(Integer id) {
        return categoriaRepository.findById(id);
    }

    //R
    public boolean existsById(Integer id) {
        return categoriaRepository.existsById(id);
    }

    //D
    public boolean deleteCategoriaById(Integer id) {
        if(categoriaRepository.findById(id).isPresent()) {
            categoriaRepository.deleteById(id);
            return true;
        }
        return false;
    }

    //C
    public Optional<Categoria> addCategoria(Categoria categoria) {
        if (categoriaRepository.findById(categoria.getIdCategoria()).isEmpty()) {
            categoriaRepository.save(categoria);
            return Optional.of(categoria);
        }
        return Optional.empty();
    }

    //U
    public Optional<Integer> updateCategoria(Categoria categoria) {
        if (existsById(categoria.getIdCategoria())) {
            return Optional.of(this.categoriaRepository.save(categoria).getIdCategoria());
        }
        return Optional.empty();
    }
}

