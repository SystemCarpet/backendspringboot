package co.edu.sena.systemcarpet.dtos;

import co.edu.sena.systemcarpet.entities.Articulo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EntregaMaterialDto implements Serializable {
    private Long id;
    private Date fechaEntrega;
    private int cantidad;
    private List<Articulo> articuloList;
}
