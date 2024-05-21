package co.edu.sena.systemcarpet.repositories;

import co.edu.sena.systemcarpet.entities.TipoArticulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoArticuloRepository extends JpaRepository<TipoArticulo, Long> {
}
