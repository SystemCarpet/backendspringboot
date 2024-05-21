package co.edu.sena.systemcarpet.service;

import co.edu.sena.systemcarpet.entities.Categoria;
import co.edu.sena.systemcarpet.repositories.CategoriaRepository;
import co.edu.sena.systemcarpet.service.daoServices.DaoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService implements DaoServices<Categoria, Long> {

    @Autowired
    private CategoriaRepository categoriaRepository;
    @Override
    public List<Categoria> fAll() {
        return this.categoriaRepository.findAll();
    }

    @Override
    public Categoria fById(Long id) {
        return this.categoriaRepository.getById(id);
    }

    @Override
    public int save(Categoria obje) {
        this.categoriaRepository.save(obje);
        return 1;
    }

    @Override
    public int delete(Categoria obje) {
        this.categoriaRepository.delete(obje);
        return 1;
    }

    @Override
    public int update(Categoria obje) {
        return 0;
    }
}
