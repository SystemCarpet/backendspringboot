package co.edu.sena.systemcarpet.dtos;

import co.edu.sena.systemcarpet.entities.Direccion;
import co.edu.sena.systemcarpet.entities.Rol;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDto implements Serializable {
    private Long id;
    private String nombre;
    private String sNombre;
    private String apellido;
    private String sApellido;
    private String contrasenia;
    private String email;
    private int telefono;
    private Rol rolId;
    private Direccion direccionId;
}
