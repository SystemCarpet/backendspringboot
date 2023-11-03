package co.edu.sena.systemcarpet.models.entities.inventario.articulos;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "tipos_articulos")
public class TipoArticulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipos_articulos", nullable = false)
    private Integer idTipoArticulo;
    @Column(name = "nombre_tipo_articulo", length = 30, nullable = false,unique = true)
    private String nombreTipoArticulo;

    public TipoArticulo(String nombreTipoArticulo) {
        this.nombreTipoArticulo = nombreTipoArticulo;
    }
}
