package co.edu.sena.systemcarpet.models.entities.ventas;

import co.edu.sena.systemcarpet.models.entities.actores.Usuario;
import co.edu.sena.systemcarpet.models.entities.ventas.infventa.EstadoPedido;
import co.edu.sena.systemcarpet.models.entities.ventas.infventa.MetodoEntrega;
import co.edu.sena.systemcarpet.models.entities.ventas.infventa.MetodoPago;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido", nullable = false)
    private Integer idPedido;

    @Column(name = "fecha_entrega_pedido", nullable = false)
    private LocalDate fechaEntregaPedido;

    @Column(name = "precio_total_pedido", nullable = false)
    private BigDecimal precioTotalPedido;

    @Column(name = "fecha_pago_pedido", nullable = false)
    private LocalDateTime fechaPagoPedido;

    @ManyToOne
    @JoinColumn(name = "usuario_id",nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "metodo_entrega_id",nullable = false)
    private MetodoEntrega metodoEntrega;

    @ManyToOne
    @JoinColumn(name = "metodo_pago_id",nullable = false)
    private MetodoPago metodoPago;

    @ManyToOne
    @JoinColumn(name = "estado_pedidido_id",nullable = false)
    private EstadoPedido estadoPedido;

    public Pedido(LocalDate fechaEntregaPedido, BigDecimal precioTotalPedido, LocalDateTime fechaPagoPedido, Usuario usuario, MetodoEntrega metodoEntrega, MetodoPago metodoPago, EstadoPedido estadoPedido) {
        this.fechaEntregaPedido = fechaEntregaPedido;
        this.precioTotalPedido = precioTotalPedido;
        this.fechaPagoPedido = fechaPagoPedido;
        this.usuario = usuario;
        this.metodoEntrega = metodoEntrega;
        this.metodoPago = metodoPago;
        this.estadoPedido = estadoPedido;
    }
}
