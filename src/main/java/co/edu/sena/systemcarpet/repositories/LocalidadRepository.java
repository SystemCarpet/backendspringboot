package co.edu.sena.systemcarpet.repositories;

import co.edu.sena.systemcarpet.entities.Localidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalidadRepository extends JpaRepository<Localidad, Long> {
}
