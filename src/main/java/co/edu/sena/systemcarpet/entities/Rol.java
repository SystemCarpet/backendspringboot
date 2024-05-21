package co.edu.sena.systemcarpet.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "roles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rol implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol")
    private Long id;

    @Column(name = "nombre_rol", length = 25)
    private String nombre;

    @Column(name = "estado_rol")
    private boolean estado;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable( name = "roles_permisos",
            joinColumns = @JoinColumn(name = "rol_id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "permiso_id", nullable = false)
    )
    private List<Permiso> permisosList;

}
