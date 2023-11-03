package co.edu.sena.systemcarpet.models.entities.inventario.productos.infvehiculo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "marcas_vehiculos")
public class MarcaVehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_marca_vehiculo", nullable = false)
    private Integer idMarcaVehiculo;

    @Column(name = "nombre_marca_vehiculo", length = 30, nullable = false,unique = true)
    private String nombreMarcaVehiculo;

    public MarcaVehiculo(String nombreMarcaVehiculo) {
        this.nombreMarcaVehiculo = nombreMarcaVehiculo;
    }
}
