package co.edu.sena.systemcarpet.service;

import co.edu.sena.systemcarpet.entities.Permiso;
import co.edu.sena.systemcarpet.repositories.PermisoRepository;
import co.edu.sena.systemcarpet.service.daoServices.DaoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermisoService implements DaoServices<Permiso, Long> {

    @Autowired
    private PermisoRepository permisoRepository;
    @Override
    public List<Permiso> fAll() {
        return this.permisoRepository.findAll();
    }

    @Override
    public Permiso fById(Long id) {
        return this.permisoRepository.getById(id);
    }

    @Override
    public int save(Permiso obje) {
        this.permisoRepository.save(obje);
        return 1;
    }

    @Override
    public int delete(Permiso obje) {
        this.permisoRepository.delete(obje);
        return 1;
    }

    @Override
    public int update(Permiso obje) {
        return 0;
    }
}
