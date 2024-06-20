package co.edu.sena.SystemCarpet.model.inventario.productos.infovehiculo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
@Table(name = "modelos_vehiculos")
public class ModeloVehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_modelo_vehiculo")
    private Integer idModeloVehiculo;

    @Column(name = "nombre_modelo_vehiculo", length = 30, nullable = false,unique = true)
    private String nombreModeloVehiculo;

    @Column(name = "numero_modelo_vehiculo", nullable = false)
    private Integer numeroModeloVehiculo;
    @ManyToOne
    @JoinColumn(name = "marca_vehiculo_id")
    private MarcaVehiculo marcaVehiculo;
    @ManyToOne
    @JoinColumn(name = "tipo_vehiculo_id")
    private TipoVehiculo tipoVehiculo;
}