package co.edu.sena.systemcarpet.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "pedidos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    private Long id;

    @Column(name = "fecha_entrega_pedido")
    private Date fechaEntrega;

    @Column(name = "precio_total_pedido")
    private Double precio;

    @Column(name = "fecha_pago_pedido")
    private Date fechaPago;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuarioId;

    @ManyToOne
    @JoinColumn(name = "id_metodo_entrega")
    private MetodoEntrega metodoEntregaId;

    @ManyToOne
    @JoinColumn(name = "id_metodo_pago")
    private MetodoPago metodoPagoId;

    @ManyToOne
    @JoinColumn(name = "id_estado_pedido")
    private EstadoPedido estadoPedidoId;

}
