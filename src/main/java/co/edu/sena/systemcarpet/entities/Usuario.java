package co.edu.sena.systemcarpet.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id;

    @Column(name = "p_nombre", length = 30)
    private String nombre;

    @Column(name = "s_nombre", length = 30)
    private String s_nombre;

    @Column(name = "p_apellido", length = 30)
    private String apellido;

    @Column(name = "s_apellido", length = 30)
    private String s_apellido;

    @Column(name = "contrasenia", length = 30)
    private String contrasenia;

    @Column(name = "email", length = 60)
    private String email;

    @Column(name = "telefono", length = 10)
    private int telefono;

    @ManyToOne
    @JoinColumn(name = "id_rol")
    private Rol rol_id;

    @ManyToOne
    @JoinColumn(name = "id_direccion")
    private Direccion direccion_id;


}
