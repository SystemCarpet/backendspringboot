package co.edu.sena.systemcarpet.dtos;

import co.edu.sena.systemcarpet.entities.Localidad;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BarrioDto implements Serializable {
    private Long id;
    private String nombre;
    private Localidad localidad_id;
}
