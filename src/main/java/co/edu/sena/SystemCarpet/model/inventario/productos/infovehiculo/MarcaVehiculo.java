package co.edu.sena.SystemCarpet.model.inventario.productos.infovehiculo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "marcas_vehiculos")
public class MarcaVehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_marca_vehiculo")
    private Integer idMarcaVehiculo;

    @Column(name = "nombre_marca_vehiculo", length = 30, nullable = false,unique = true)
    private String nombreMarcaVehiculo;

}