package co.edu.sena.systemcarpet.dtos;

import co.edu.sena.systemcarpet.entities.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdenPersonalizadaDto implements Serializable {
    private Long id;
    private Date fechaCreacion;
    private boolean antideslizante;
    private boolean impermeable;
    private Usuario usuarioId;
    private Producto productoId;
    private Color colorId;
    private Estampado estampadoId;
    private List<Articulo> articuloList;
}
