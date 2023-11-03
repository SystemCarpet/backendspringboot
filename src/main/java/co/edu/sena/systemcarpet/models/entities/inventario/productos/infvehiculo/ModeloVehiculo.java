package co.edu.sena.systemcarpet.models.entities.inventario.productos.infvehiculo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
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
