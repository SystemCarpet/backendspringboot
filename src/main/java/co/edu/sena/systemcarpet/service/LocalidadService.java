package co.edu.sena.systemcarpet.service;

import co.edu.sena.systemcarpet.entities.Localidad;
import co.edu.sena.systemcarpet.repositories.LocalidadRepository;
import co.edu.sena.systemcarpet.service.daoServices.DaoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalidadService implements DaoServices<Localidad, Long> {

    @Autowired
    private LocalidadRepository localidadRepository;
    @Override
    public List<Localidad> fAll() {
        return this.localidadRepository.findAll();
    }

    @Override
    public Localidad fById(Long id) {
        return this.localidadRepository.getById(id);
    }

    @Override
    public int save(Localidad obje) {
        this.localidadRepository.save(obje);
        return 1;
    }

    @Override
    public int delete(Localidad obje) {
        this.localidadRepository.delete(obje);
        return 1;
    }

    @Override
    public int update(Localidad obje) {
        return 0;
    }
}
