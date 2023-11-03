package co.edu.sena.systemcarpet.models.entities.ventas.infventa;


import co.edu.sena.systemcarpet.models.entities.inventario.productos.Producto;
import co.edu.sena.systemcarpet.models.entities.ventas.Pedido;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "detalle_pedido")
public class DetallePedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle_pedido", nullable = false)
    private Integer idDetallePedido;

    @Column(name = "cantidad_solicitada", nullable = false)
    private Integer cantidadSolicitada;

    @ManyToOne
    @JoinColumn(name = "producto_id",nullable = false)
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "pedido_id",nullable = false)
    private Pedido pedido;

    public DetallePedido(Integer cantidadSolicitada, Producto producto, Pedido pedido) {
        this.cantidadSolicitada = cantidadSolicitada;
        this.producto = producto;
        this.pedido = pedido;
    }
}
