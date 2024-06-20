package co.edu.sena.SystemCarpet.model.actores.accesos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "permisos")
//lombok
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Permiso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_permiso")
    private Integer idPermiso;

    @Column(name = "nombre_permiso", length = 30, nullable = false,unique = true)
    private String nombrePermiso;

    @ManyToMany(mappedBy = "permisos")
    private List<Rol> roles;

}
