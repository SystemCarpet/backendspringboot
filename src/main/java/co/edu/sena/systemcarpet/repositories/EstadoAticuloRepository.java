package co.edu.sena.systemcarpet.repositories;

import co.edu.sena.systemcarpet.entities.EstadoArticulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoAticuloRepository extends JpaRepository<EstadoArticulo, Long> {
}
