package co.edu.sena.systemcarpet.service;

import co.edu.sena.systemcarpet.model.inventario.productos.Producto;
import co.edu.sena.systemcarpet.repository.IProductoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    private final IProductoRepository productoRepository;

    public ProductoService(IProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    //R
    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }

    //R
    public Optional<Producto> getProductoById(Integer id) {
        return productoRepository.findById(id);
    }

    //R
    public boolean existsById(Integer id) {
        return productoRepository.existsById(id);
    }

    //D
    public boolean deleteProductoById(Integer id) {
        if(productoRepository.findById(id).isPresent()) {
            productoRepository.deleteById(id);
            return true;
        }
        return false;
    }

    //C
    public Optional<Producto> addProducto(Producto producto) {
        if (productoRepository.findById(producto.getIdProducto()).isEmpty()) {
            productoRepository.save(producto);
            return Optional.of(producto);
        }
        return Optional.empty();
    }

    //U
    public Optional<Integer> updateProducto(Producto producto) {
        if (existsById(producto.getIdProducto())) {
            return Optional.of(this.productoRepository.save(producto).getIdProducto());
        }
        return Optional.empty();
    }
}
