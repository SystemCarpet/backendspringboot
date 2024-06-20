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
    @Column(name = "id_modelo_vehiculo", nullable = false)
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

    public ModeloVehiculo(String nombreModeloVehiculo, Integer numeroModeloVehiculo, MarcaVehiculo marcaVehiculo, TipoVehiculo tipoVehiculo) {
        this.nombreModeloVehiculo = nombreModeloVehiculo;
        this.numeroModeloVehiculo = numeroModeloVehiculo;
        this.marcaVehiculo = marcaVehiculo;
        this.tipoVehiculo = tipoVehiculo;
    }
}