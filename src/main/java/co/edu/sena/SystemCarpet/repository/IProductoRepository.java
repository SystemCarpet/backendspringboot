package co.edu.sena.SystemCarpet.repository;


import co.edu.sena.SystemCarpet.model.inventario.productos.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoRepository extends JpaRepository<Producto,Integer> {
}
