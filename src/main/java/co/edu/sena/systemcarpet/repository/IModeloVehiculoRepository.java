package co.edu.sena.systemcarpet.repository;

import co.edu.sena.systemcarpet.model.inventario.productos.infovehiculo.ModeloVehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IModeloVehiculoRepository extends JpaRepository<ModeloVehiculo,Integer> {
}
