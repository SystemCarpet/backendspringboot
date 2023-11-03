package co.edu.sena.systemcarpet.controllers;

import co.edu.sena.systemcarpet.models.entities.inventario.productos.Producto;
import co.edu.sena.systemcarpet.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    private final ProductoService productoService;
    @Autowired
    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }
    @GetMapping
    public List<Producto> getAllProducts(){
        return productoService.getAllProducts();
    }
    @GetMapping({"/{id}","/{id}/update","/{id}/delete"})
    public Optional<Producto> getProductById(@PathVariable("id") Integer id){
        return productoService.getProductById(id);
    }
    @PostMapping("/add")
    public Optional<Producto> addProduct(@RequestBody Producto product){
      return productoService.addProduct(product);
    }
    @PatchMapping("/{id}/update")
    public Optional<Producto> updateProduct(@RequestBody Producto product, @PathVariable Integer id){
        if (productoService.existsById(id)){
            productoService.updateProduct(product);
            return productoService.getProductById(id);
        }else {
            return Optional.empty();
        }

    }
    @DeleteMapping("/{id}/delete")
    public Optional<Producto> deleteProductById(@PathVariable("id")Integer id){
        if (productoService.existsById(id)){
            Optional<Producto> del = productoService.getProductById(id);
            productoService.deleteProductById(id);
            return del;
        }
        return Optional.empty();
    }
}
