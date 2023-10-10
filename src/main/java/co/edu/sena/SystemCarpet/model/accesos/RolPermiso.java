package co.edu.sena.SystemCarpet.model.accesos;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "roles_permisos")
public class RolPermiso {

    @ManyToOne
    @JoinColumn(name = "rol_id",nullable = false)
    private Rol rol;

    @ManyToOne
    @JoinColumn(name = "permiso_id",nullable = false)
    private Permiso permiso;
}

