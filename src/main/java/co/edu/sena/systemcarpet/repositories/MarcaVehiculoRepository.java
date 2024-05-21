package co.edu.sena.systemcarpet.repositories;

import co.edu.sena.systemcarpet.entities.MarcaVehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaVehiculoRepository extends JpaRepository<MarcaVehiculo, Long> {
}
