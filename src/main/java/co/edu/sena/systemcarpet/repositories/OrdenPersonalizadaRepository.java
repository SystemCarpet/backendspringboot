package co.edu.sena.systemcarpet.repositories;

import co.edu.sena.systemcarpet.entities.OrdenPersonalizada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdenPersonalizadaRepository extends JpaRepository<OrdenPersonalizada, Long> {
}
