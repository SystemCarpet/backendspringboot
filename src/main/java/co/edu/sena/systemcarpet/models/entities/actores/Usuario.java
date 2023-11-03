package co.edu.sena.systemcarpet.models.entities.actores;

import co.edu.sena.systemcarpet.models.entities.actores.accesos.Rol;
import co.edu.sena.systemcarpet.models.entities.direcciones.Direccion;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario", nullable = false)
    private Integer idUsuario;
    @Column(name = "nombre_usuario", length = 30, nullable = false)
    private String nombreUsuario;
    @Column(name = "apellido_usuario", length = 30, nullable = false)
    private String apellidoUsuario;
    @Column(name = "contrasenia", length = 30, nullable = false)
    private String contrasenia;
    @Column(name = "email", length = 60, nullable = false, unique = true)
    private String correoPersonal;
    @Column(name = "telefono", length = 10, nullable = false, unique = true)
    private String telefonoCelular;
    @ManyToOne
    @JoinColumn(name = "rol_id")
    private Rol rol;
    @ManyToOne
    @JoinColumn(name = "direccion_id")
    private Direccion direccion;

    public Usuario(String nombreUsuario, String apellidoUsuario, String contrasenia, String correoPersonal, String telefonoCelular, Rol rol, Direccion direccion) {
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.contrasenia = contrasenia;
        this.correoPersonal = correoPersonal;
        this.telefonoCelular = telefonoCelular;
        this.rol = rol;
        this.direccion = direccion;
    }
}
