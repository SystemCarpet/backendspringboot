package co.edu.sena.systemcarpet.dtos;

import co.edu.sena.systemcarpet.entities.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticuloDto {

    private Long id;
    private String nombre;
    private int cantidad;
    private int cantidad_min;
    private int cantidad_max;
    private String dimensiones;
    private String descripcion;
    private double precio;
    private EstadoArticulo estado_articulo_id;
    private TipoArticulo tipo_articulo_id;
    private List<OrdenPersonalizada> ordenPersonalizadaList;
    private List<EntregaMaterial> entregaMaterialList;


}
