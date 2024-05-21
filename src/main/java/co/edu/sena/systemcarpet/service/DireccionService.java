package co.edu.sena.systemcarpet.service;

import co.edu.sena.systemcarpet.entities.Direccion;
import co.edu.sena.systemcarpet.repositories.DireccionRepository;
import co.edu.sena.systemcarpet.service.daoServices.DaoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DireccionService implements DaoServices<Direccion, Long> {

    @Autowired
    private DireccionRepository direccionRepository;
    @Override
    public List<Direccion> fAll() {
        return this.direccionRepository.findAll();
    }

    @Override
    public Direccion fById(Long id) {
        return this.direccionRepository.getById(id);
    }

    @Override
    public int save(Direccion obje) {
        this.direccionRepository.save(obje);
        return 1;
    }

    @Override
    public int delete(Direccion obje) {
        this.direccionRepository.delete(obje);
        return 1;
    }

    @Override
    public int update(Direccion obje) {
        return 0;
    }
}
