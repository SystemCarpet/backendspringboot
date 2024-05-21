package co.edu.sena.systemcarpet.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "prosuctos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long id;

    @Column(name = "imagen_producto")
    private String imagen;

    @ManyToOne
    @JoinColumn(name = "id_articulo")
    private Articulo articuloId;

    @ManyToOne
    @JoinColumn(name = "id_catedoria")
    private Categoria categoriaId;

    @ManyToOne
    @JoinColumn(name = "id_modelo_vehiculo")
    private ModeloVehiculo modeloVehiculoId;

}
