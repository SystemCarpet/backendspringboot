package co.edu.sena.systemcarpet.repositories;

import co.edu.sena.systemcarpet.entities.PrecioProveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrecioProveedorRepository extends JpaRepository<PrecioProveedor, Long> {
}
