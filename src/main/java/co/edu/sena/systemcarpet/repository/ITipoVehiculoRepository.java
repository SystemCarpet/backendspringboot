package co.edu.sena.systemcarpet.repository;


import co.edu.sena.systemcarpet.model.inventario.productos.infovehiculo.TipoVehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITipoVehiculoRepository extends JpaRepository<TipoVehiculo,Integer> {
}
