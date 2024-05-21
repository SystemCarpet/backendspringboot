package co.edu.sena.systemcarpet.dtos;

import co.edu.sena.systemcarpet.entities.MarcaVehiculo;
import co.edu.sena.systemcarpet.entities.TipoVehiculo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModeloVehiculoDto implements Serializable {
    private Long id;
    private String nombre;
    private int numero;
    private MarcaVehiculo marcaVehiculoVehiculoId;
    private TipoVehiculo tipoVehiculoVehiculoId;
}
