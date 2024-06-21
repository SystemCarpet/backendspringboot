package co.edu.sena.systemcarpet.model.inventario.articulos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
@Table(name = "tipos_articulo")
public class TiposArticulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_articulo")
    private Integer idTipoArticulo;

    @Column(name = "nombre_tipo_articulo", length = 30, nullable = false,unique = true)
    private String nombreTipoArticulo;
}