package co.edu.sena.systemcarpet.service;

import co.edu.sena.systemcarpet.entities.TipoArticulo;
import co.edu.sena.systemcarpet.repositories.TipoArticuloRepository;
import co.edu.sena.systemcarpet.service.daoServices.DaoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoArticuloService implements DaoServices<TipoArticulo, Long> {

    @Autowired
    private TipoArticuloRepository tipoArticuloRepository;
    @Override
    public List<TipoArticulo> fAll() {
        return this.tipoArticuloRepository.findAll();
    }

    @Override
    public TipoArticulo fById(Long id) {
        return this.tipoArticuloRepository.getById(id);
    }

    @Override
    public int save(TipoArticulo obje) {
        this.tipoArticuloRepository.save(obje);
        return 1;
    }

    @Override
    public int delete(TipoArticulo obje) {
        this.tipoArticuloRepository.delete(obje);
        return 1;
    }

    @Override
    public int update(TipoArticulo obje) {
        return 0;
    }
}
