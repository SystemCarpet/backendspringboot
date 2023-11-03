package co.edu.sena.systemcarpet.models.entities.ventas.infventa;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "estado_pedido")
public class EstadoPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estado_pedido", nullable = false)
    private Integer idEstadoPedido;

    @Column(name = "nombre_estado_pedido",length = 30, nullable = false,unique = true)
    private String nombreEstadoPedido;

    public EstadoPedido(String nombreEstadoPedido) {
        this.nombreEstadoPedido = nombreEstadoPedido;
    }
}
