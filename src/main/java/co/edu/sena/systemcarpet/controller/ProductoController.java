package co.edu.sena.systemcarpet.controller;

import co.edu.sena.systemcarpet.model.inventario.productos.Producto;
import co.edu.sena.systemcarpet.service.ProductoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/productos")
public class ProductoController {
    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public List<Producto> getAllProductos() {
        return productoService.getAllProductos();
    }

    @GetMapping({"/{id}", "/{id}/update", "/{id}/delete"})
    public Optional<Producto> getProductoById(@PathVariable("id") Integer id) {
        return productoService.getProductoById(id);
    }

    @PostMapping("/add")
    public Optional<Producto> addProducto(@RequestBody Producto producto) {
        return productoService.addProducto(producto);
    }

    @PatchMapping("/{id}/update")
    public Optional<Producto> updateProducto(@RequestBody Producto producto) {

        if (productoService.existsById(producto.getIdProducto())) {
            productoService.updateProducto(producto);
            return productoService.getProductoById(producto.getIdProducto());
        } else {
            return Optional.empty();
        }
    }

    @DeleteMapping("/{id}/delete")
    public Optional<Producto> deleteProductoById(@PathVariable("id") Integer id) {
        if (productoService.existsById(id)) {
            Optional<Producto> del = productoService.getProductoById(id);
            productoService.deleteProductoById(id);
            return del;
        }
        return Optional.empty();
    }
}
