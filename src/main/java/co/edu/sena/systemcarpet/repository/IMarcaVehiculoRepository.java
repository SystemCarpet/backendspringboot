package co.edu.sena.systemcarpet.repository;


import co.edu.sena.systemcarpet.model.inventario.productos.infovehiculo.MarcaVehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMarcaVehiculoRepository extends JpaRepository<MarcaVehiculo,Integer> {
}
