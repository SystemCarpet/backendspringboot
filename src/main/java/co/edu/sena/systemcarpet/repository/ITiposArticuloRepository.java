package co.edu.sena.systemcarpet.repository;

import co.edu.sena.systemcarpet.model.inventario.articulos.TiposArticulo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITiposArticuloRepository extends JpaRepository<TiposArticulo,Integer> {
}
