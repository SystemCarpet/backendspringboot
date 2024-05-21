package co.edu.sena.systemcarpet.dtos;

import co.edu.sena.systemcarpet.entities.Articulo;
import co.edu.sena.systemcarpet.entities.Categoria;
import co.edu.sena.systemcarpet.entities.MarcaVehiculo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoDto implements Serializable {
    private Long id;
    private String imangen;
    private Articulo articuloId;
    private Categoria categoriaId;
    private MarcaVehiculo marcaVehiculoId;
}
