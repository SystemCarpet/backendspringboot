package co.edu.sena.systemcarpet.dtos;

import co.edu.sena.systemcarpet.entities.Pedido;
import co.edu.sena.systemcarpet.entities.Producto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetallePedidoDto implements Serializable {
    private Long id;
    private int cantidad;
    private Producto producto_id;
    private Pedido pedido_id;
}
