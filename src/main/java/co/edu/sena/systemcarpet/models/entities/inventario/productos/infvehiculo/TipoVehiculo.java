package co.edu.sena.systemcarpet.models.entities.inventario.productos.infvehiculo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "tipos_vehiculos")
public class TipoVehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_vehiculo", nullable = false)
    private Integer idTipoVehiculo;

    @Column(name = "nombre_tipo_vehiculo", length = 30, nullable = false,unique = true)
    private String nombreTipoVehiculo;

    public TipoVehiculo(String nombreTipoVehiculo) {
        this.nombreTipoVehiculo = nombreTipoVehiculo;
    }
}
