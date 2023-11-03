package co.edu.sena.systemcarpet.services;

import co.edu.sena.systemcarpet.models.entities.inventario.productos.Producto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProductoService {
    public List<Producto> getAllProducts();
    public Optional<Producto> getProductById(Integer id);
    public void deleteProductById(Integer id);
    public Optional<Producto> addProduct(Producto product);
    public void updateProduct(Producto product);
    public boolean existsById(Integer id);
}
