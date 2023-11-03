package co.edu.sena.systemcarpet.services.implementations;

import co.edu.sena.systemcarpet.models.entities.inventario.productos.Producto;
import co.edu.sena.systemcarpet.repositories.IProductoRepository;
import co.edu.sena.systemcarpet.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductoServiceImpl implements ProductoService {
    private final IProductoRepository iProductoRepository;

    @Autowired
    public ProductoServiceImpl(IProductoRepository iProductoRepository) {
        this.iProductoRepository = iProductoRepository;
    }


    //R
    public List<Producto> getAllProducts(){
        return iProductoRepository.findAll();
    }
    //R
    public Optional<Producto> getProductById(Integer id){
        return iProductoRepository.findById(id);
    }
    //R
    public boolean existsById(Integer id){
        return iProductoRepository.existsById(id);
    }
    //D
    public void deleteProductById(Integer id){
        iProductoRepository.deleteById(id);

    }
    //C
    public Optional<Producto> addProduct(Producto product){
        if (!iProductoRepository.findById(product.getIdProducto()).isPresent()){
            iProductoRepository.save(product);
            return Optional.of(product);
        }
        return Optional.empty();
    }
    //U

    public void updateProduct(Producto product){
        if (product.getIdProducto()!=null && existsById(product.getIdProducto())){
            iProductoRepository.save(product);
        }
    }
}
