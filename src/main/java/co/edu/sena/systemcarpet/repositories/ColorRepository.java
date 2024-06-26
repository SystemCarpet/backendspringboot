package co.edu.sena.systemcarpet.repositories;

import co.edu.sena.systemcarpet.entities.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorRepository extends JpaRepository<Color, Long> {
}
