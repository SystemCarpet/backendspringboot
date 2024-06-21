package co.edu.sena.systemcarpet.repository;


import co.edu.sena.systemcarpet.model.inventario.productos.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoRepository extends JpaRepository<Producto,Integer> {
}
