package co.edu.sena.systemcarpet.dtos;
import co.edu.sena.systemcarpet.entities.Direccion;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProveedorDto implements Serializable {
    private Long id;
    private String nombre;
    private int telefono;
    private String email;
    private Direccion direccionId;
}
