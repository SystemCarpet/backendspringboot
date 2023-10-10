package co.edu.sena.SystemCarpet.model.accesos;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "roles")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol")
    private Integer idRol;
    @Column(name = "nombre_rol", length = 30, nullable = false,unique = true)
    private String nombreRol;

    public Rol(String nombreRol) {
        this.nombreRol = nombreRol;
    }
}
