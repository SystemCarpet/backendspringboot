package co.edu.sena.systemcarpet.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "articulos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Articulo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_articulo")
    private Long id;

    @Column(name = "nombre_articulo", length = 30)
    private String nombre;

    @Column(name = "catidad_articulo")
    private int cantidad;

    @Column(name = "cantidad_minima")
    private int cantidad_min;

    @Column(name = "cantidad_maxima")
    private int cantidad_max;

    @Column(name = "dimensiones_articulo", length = 30)
    private String dimensiones;

    @Column(name = "descripcion_articulo", length = 100)
    private String descripcion;

    @Column(name = "precio_articulo")
    private double precio;

    @ManyToOne
    @JoinColumn(name = "id_estado_articulo")
    private EstadoArticulo estado_articulo_id;

    @ManyToOne
    @JoinColumn(name = "id_tipo_articulo")
    private TipoArticulo tipo_articulo_id;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "materiales_orden_personalizada",
        joinColumns = @JoinColumn(name = "articulo_id", nullable = false ),
        inverseJoinColumns = @JoinColumn(name = "orden_personalizada_id", nullable = false)
    )
    private List<OrdenPersonalizada> ordenPersonalizadaList;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "esntregas_articulos",
        joinColumns = @JoinColumn(name = "articulo_id", nullable = false),
        inverseJoinColumns = @JoinColumn(name = "entrega_material_id", nullable = false)
    )
    private List<EntregaMaterial> entregaMaterialList;

}
