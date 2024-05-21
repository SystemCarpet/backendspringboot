package co.edu.sena.systemcarpet.repositories;

import co.edu.sena.systemcarpet.entities.MetodoEntrega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetodoEntregaRepository extends JpaRepository<MetodoEntrega, Long> {
}
