package co.edu.sena.systemcarpet.service;

import co.edu.sena.systemcarpet.entities.Proveedor;
import co.edu.sena.systemcarpet.repositories.ProveedorRepository;
import co.edu.sena.systemcarpet.service.daoServices.DaoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorService implements DaoServices<Proveedor, Long> {

    @Autowired
    private ProveedorRepository proveedorRepository;
    @Override
    public List<Proveedor> fAll() {
        return this.proveedorRepository.findAll();
    }

    @Override
    public Proveedor fById(Long id) {
        return this.proveedorRepository.getById(id);
    }

    @Override
    public int save(Proveedor obje) {
        this.proveedorRepository.save(obje);
        return 1;
    }

    @Override
    public int delete(Proveedor obje) {
        this.proveedorRepository.delete(obje);
        return 1;
    }

    @Override
    public int update(Proveedor obje) {
        return 0;
    }
}
