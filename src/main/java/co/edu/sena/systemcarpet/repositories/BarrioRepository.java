package co.edu.sena.systemcarpet.repositories;

import co.edu.sena.systemcarpet.entities.Barrio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarrioRepository extends JpaRepository<Barrio, Long> {
}
