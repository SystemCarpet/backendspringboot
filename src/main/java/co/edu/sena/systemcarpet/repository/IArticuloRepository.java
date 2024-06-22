package co.edu.sena.systemcarpet.repository;

import co.edu.sena.systemcarpet.model.inventario.articulos.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IArticuloRepository extends JpaRepository<Articulo,Integer> {
}
