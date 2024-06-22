package co.edu.sena.systemcarpet.model.actores.accesos;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "roles")
//lombok
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol")
    private Integer idRol;
    @Column(name = "nombre_rol", length = 30,unique = true)
    private String nombreRol;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(
            name = "roles_permisos",
            joinColumns = @JoinColumn(name="rol_id",referencedColumnName = "id_rol"),
            inverseJoinColumns = @JoinColumn(name="permiso_id",referencedColumnName = "id_permiso")
    )
    private List<Permiso> permisos;
}
