package co.edu.sena.systemcarpet.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "modelos_vehiculos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ModeloVehiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_modelo_vehiculo")
    private Long id;

    @Column(name = "nombre_modelo_vehiculo", length = 30)
    private String nombre;

    @Column(name = "numero_modelo_vehiculo")
    private int numero;

    @ManyToOne
    @JoinColumn(name = "id_marca_vehiculo")
    private MarcaVehiculo marcaVehiculoId;

    @ManyToOne
    @JoinColumn(name = "id_tipo_vehiculo")
    private TipoVehiculo tipoVehiculoId;

}
