package co.edu.sena.systemcarpet.dtos;

import co.edu.sena.systemcarpet.entities.Rol;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PermisoDto implements Serializable {
    private Long id;
    private String nombre;
    private List<Rol> rolList;
}
