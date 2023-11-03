package co.edu.sena.systemcarpet.models.entities.ventas;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "catalogos")
public class Catalogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_catalogo", nullable = false)
    private Integer idCatalogo;

    @Column(name = "nombre_catalogo",length = 30, nullable = false,unique = true)
    private String nombreCatalogo;

    public Catalogo(String nombreCatalogo) {
        this.nombreCatalogo = nombreCatalogo;
    }
}
