package co.edu.sena.systemcarpet.repositories;

import co.edu.sena.systemcarpet.models.entities.ventas.Catalogo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICatalogoRepository extends JpaRepository<Catalogo,Integer> {
}
