package co.edu.sena.systemcarpet.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "orden_personalizada")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrdenPersonalizada implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_orden_personalizada")
    private Long id;

    @Column(name = "fecha_creacion_orden_personalizada")
    private Date fechaCreacion;

    @Column(name = "base_antideslizante")
    private boolean antideslizante;

    @Column(name = "impermeable")
    private boolean impermeable;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuarioId;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto productoId;

    @ManyToOne
    @JoinColumn(name = "id_color")
    private Color colorId;

    @ManyToOne
    @JoinColumn(name = "id_estampado")
    private Estampado estampadoId;

    @ManyToMany(mappedBy = "ordenPersonalizadaList")
    private List<Articulo> articuloList;

}
