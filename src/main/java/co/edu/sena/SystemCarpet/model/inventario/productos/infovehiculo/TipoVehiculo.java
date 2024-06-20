package co.edu.sena.SystemCarpet.model.inventario.productos.infovehiculo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
@Table(name = "tipos_vehiculos")
public class TipoVehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_vehiculo")
    private Integer idTipoVehiculo;

    @Column(name = "nombre_tipo_vehiculo", length = 30, nullable = false,unique = true)
    private String nombreTipoVehiculo;

}