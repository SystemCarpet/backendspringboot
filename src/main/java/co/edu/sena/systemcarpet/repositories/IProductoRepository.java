package co.edu.sena.systemcarpet.repositories;

import co.edu.sena.systemcarpet.models.entities.inventario.productos.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IProductoRepository extends JpaRepository<Producto,Integer> {
}
