package co.edu.sena.systemcarpet.dtos;

import co.edu.sena.systemcarpet.entities.Barrio;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DireccionDto implements Serializable {
    private Long id;
    private String detalles;
    private Barrio barrio_id;
}
