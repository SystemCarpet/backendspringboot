package co.edu.sena.systemcarpet.repositories;

import co.edu.sena.systemcarpet.entities.ModeloVehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeloVehiculoRepository extends JpaRepository<ModeloVehiculo, Long> {
}
