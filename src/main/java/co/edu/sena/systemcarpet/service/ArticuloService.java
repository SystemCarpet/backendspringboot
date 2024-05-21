package co.edu.sena.systemcarpet.service;

import co.edu.sena.systemcarpet.entities.Articulo;
import co.edu.sena.systemcarpet.repositories.ArticuloRepository;
import co.edu.sena.systemcarpet.service.daoServices.DaoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticuloService implements DaoServices<Articulo, Long> {

    @Autowired
    private ArticuloRepository articuloRepository;
    @Override
    public List<Articulo> fAll() {
        return this.articuloRepository.findAll();
    }

    @Override
    public Articulo fById(Long id) {
        return this.articuloRepository.getById(id);
    }

    @Override
    public int save(Articulo obje) {
        this.articuloRepository.save(obje);
        return 1;
    }

    @Override
    public int delete(Articulo obje) {
        this.articuloRepository.delete(obje);
        return 1;
    }

    @Override
    public int update(Articulo obje) {
        return 0;
    }
}
