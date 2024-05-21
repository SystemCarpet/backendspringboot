package co.edu.sena.systemcarpet.service;

import co.edu.sena.systemcarpet.entities.Rol;
import co.edu.sena.systemcarpet.repositories.RolRepository;
import co.edu.sena.systemcarpet.service.daoServices.DaoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolesService implements DaoServices<Rol, Long> {

    @Autowired
    private RolRepository rolRepository;
    @Override
    public List<Rol> fAll() {
        return this.rolRepository.findAll();
    }

    @Override
    public Rol fById(Long id) {
        return this.rolRepository.getById(id);
    }

    @Override
    public int save(Rol obje) {
        this.rolRepository.save(obje);
        return 1;
    }

    @Override
    public int delete(Rol obje) {
        this.rolRepository.delete(obje);
        return 1;
    }

    @Override
    public int update(Rol obje) {
        return 0;
    }
}
