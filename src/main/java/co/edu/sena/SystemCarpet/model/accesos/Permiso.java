package co.edu.sena.SystemCarpet.model.accesos;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.LinkedList;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "permisos")
public class Permiso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_permiso", nullable = false)
    private Integer idPermiso;

    @Column(name = "nombre_permiso", length = 30, nullable = false,unique = true)
    private String nombrePermiso;

    @ManyToMany(mappedBy = "permisos")

    private LinkedList<Rol> roles;

    public Permiso(String nombrePermiso) {
        this.nombrePermiso = nombrePermiso;
    }
}
