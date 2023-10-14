package co.edu.sena.systemcarpet.model.accesos;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.List;


@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "roles")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol", nullable = false)
    private Integer idRol;
    @Column(name = "nombre_rol", length = 30, nullable = false,unique = true)
    private String nombreRol;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(
            name = "roles_permisos",
            joinColumns = @JoinColumn(name="rol_id",referencedColumnName = "id_rol"),
            inverseJoinColumns = @JoinColumn(name="permiso_id",referencedColumnName = "id_permiso")
    )
    private List<Permiso> permisos;

    public Rol(String nombreRol) {
        this.nombreRol = nombreRol;
    }
}
