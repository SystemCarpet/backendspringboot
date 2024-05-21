package co.edu.sena.systemcarpet.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstadoPedidoDto implements Serializable {
    private Long id;
    private String Nombre;
}
