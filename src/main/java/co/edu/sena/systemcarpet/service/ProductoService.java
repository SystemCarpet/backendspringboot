package co.edu.sena.systemcarpet.service;


import co.edu.sena.systemcarpet.entities.Producto;
import co.edu.sena.systemcarpet.repositories.ProductoRepository;
import co.edu.sena.systemcarpet.service.daoServices.DaoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService implements DaoServices<Producto, Long> {

    @Autowired
    private ProductoRepository productoRepository;
    @Override
    public List<Producto> fAll() {
        return this.productoRepository.findAll();
    }

    @Override
    public Producto fById(Long id) {
        return this.productoRepository.getById(id);
    }

    @Override
    public int save(Producto obje) {
        this.productoRepository.save(obje);
        return 1;
    }

    @Override
    public int delete(Producto obje) {
        this.productoRepository.delete(obje);
        return 1;
    }

    @Override
    public int update(Producto obje) {
        return 0;
    }
}
