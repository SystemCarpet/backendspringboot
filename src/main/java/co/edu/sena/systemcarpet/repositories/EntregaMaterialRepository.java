package co.edu.sena.systemcarpet.repositories;

import co.edu.sena.systemcarpet.entities.EntregaMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntregaMaterialRepository extends JpaRepository<EntregaMaterial, Long> {
}
