package co.edu.sena.systemcarpet.repositories;

import co.edu.sena.systemcarpet.entities.Estampado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstampadoRepository extends JpaRepository<Estampado, Long> {
}
