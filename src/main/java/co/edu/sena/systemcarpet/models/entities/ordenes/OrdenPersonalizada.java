package co.edu.sena.systemcarpet.models.entities.ordenes;

import co.edu.sena.systemcarpet.models.entities.actores.Usuario;
import co.edu.sena.systemcarpet.models.entities.inventario.articulos.Articulo;
import co.edu.sena.systemcarpet.models.entities.inventario.productos.Producto;
import co.edu.sena.systemcarpet.models.entities.ordenes.inforden.Color;
import co.edu.sena.systemcarpet.models.entities.ordenes.inforden.Estampado;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "orden_personalizada")
public class OrdenPersonalizada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_orden_personalizada", nullable = false)
    private Integer idOrdenPersonalizada;

    @Column(name = "fecha_creacion_orden_personalizada", nullable = false)
    private LocalDateTime fechaCreacionOrdenPersonalizada;

    @Column(name = "base_antideslizante", nullable = false)
    private Boolean baseAntideslizante;

    @Column(name = "impermeable", nullable = false)
    private Boolean impermeable;

    @ManyToOne
    @JoinColumn(name = "usuario_id",nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "producto_id",nullable = false)
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "color_id",nullable = false)
    private Color color;

    @ManyToOne
    @JoinColumn(name = "estampado_id",nullable = false)
    private Estampado estampado;

    @ManyToOne
    @JoinColumn(name = "color_borde_id",nullable = false)
    private Color colorBorde;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(
            name = "materiales_orden_personalizada",
            joinColumns = @JoinColumn(name="orden_personalizada_id",referencedColumnName = "id_orden_personalizada"),
            inverseJoinColumns = @JoinColumn(name="articulo_id",referencedColumnName = "id_articulo")
    )
    private List<Articulo> articulos;

    public OrdenPersonalizada(LocalDateTime fechaCreacionOrdenPersonalizada, Boolean baseAntideslizante, Boolean impermeable, Usuario usuario, Producto producto, Color color, Estampado estampado, Color colorBorde) {
        this.fechaCreacionOrdenPersonalizada = fechaCreacionOrdenPersonalizada;
        this.baseAntideslizante = baseAntideslizante;
        this.impermeable = impermeable;
        this.usuario = usuario;
        this.producto = producto;
        this.color = color;
        this.estampado = estampado;
        this.colorBorde = colorBorde;
    }
}
