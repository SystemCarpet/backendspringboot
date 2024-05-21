package co.edu.sena.systemcarpet.service;

import co.edu.sena.systemcarpet.entities.PrecioProveedor;
import co.edu.sena.systemcarpet.repositories.PrecioProveedorRepository;
import co.edu.sena.systemcarpet.service.daoServices.DaoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrecioProveedorService implements DaoServices<PrecioProveedor, Long> {

    @Autowired
    private PrecioProveedorRepository precioProveedorRepository;
    @Override
    public List<PrecioProveedor> fAll() {
        return this.precioProveedorRepository.findAll();
    }

    @Override
    public PrecioProveedor fById(Long id) {
        return this.precioProveedorRepository.getById(id);
    }

    @Override
    public int save(PrecioProveedor obje) {
        this.precioProveedorRepository.save(obje);
        return 1;
    }

    @Override
    public int delete(PrecioProveedor obje) {
        this.precioProveedorRepository.delete(obje);
        return 1;
    }

    @Override
    public int update(PrecioProveedor obje) {
        return 0;
    }
}
