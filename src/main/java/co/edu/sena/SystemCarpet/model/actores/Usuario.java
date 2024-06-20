package co.edu.sena.SystemCarpet.model.actores;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuarios")
//lombok
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario", nullable = false)
    private Integer idUsuario;
    @Column(name = "pnombre_usuario", length = 30, nullable = false)
    private String primerNombreUsuario;
    @Column(name = "snombre_usuario", length = 30)
    private String segundoNombreUsuario;
    @Column(name = "papellido_usuario", length = 30, nullable = false)
    private String primerApellidoUsuario;
    @Column(name = "sapellido_usuario", length = 30)
    private String apellidoUsuario;
    @Column(name = "contrasenia", length = 30, nullable = false)
    private String contrasenia;
    @Column(name = "email", length = 60, nullable = false, unique = true)
    private String email;
    @Column(name = "telefono", length = 10, nullable = false, unique = true)
    private String telefono;

}