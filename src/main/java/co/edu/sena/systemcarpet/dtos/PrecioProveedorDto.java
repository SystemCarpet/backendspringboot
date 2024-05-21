package co.edu.sena.systemcarpet.dtos;

import co.edu.sena.systemcarpet.entities.Articulo;
import co.edu.sena.systemcarpet.entities.Proveedor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrecioProveedorDto implements Serializable {
    private Long id;
    private double precio;
    private Articulo articuloId;
    private Proveedor proveedorId;
}
