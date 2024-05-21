package co.edu.sena.systemcarpet.dtos;

import co.edu.sena.systemcarpet.entities.EstadoPedido;
import co.edu.sena.systemcarpet.entities.MetodoEntrega;
import co.edu.sena.systemcarpet.entities.MetodoPago;
import co.edu.sena.systemcarpet.entities.Usuario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedidoDto implements Serializable {
    private Long id;
    private Date fechaEntrega;
    private double precio;
    private Date fechaPago;
    private Usuario usuariosId;
    private MetodoEntrega metodoEntregaId;
    private MetodoPago metodoPagoId;
    private EstadoPedido estadoPedidoId;
}
