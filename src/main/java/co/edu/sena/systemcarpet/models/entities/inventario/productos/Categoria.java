package co.edu.sena.systemcarpet.models.entities.inventario.productos;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "categorias")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria", nullable = false)
    private Integer idCategoria;

    @Column(name = "nombre_categoria", length = 30, nullable = false,unique = true)
    private String nombreCategoria;

    @Column(name = "descuento_categoria", nullable = false)
    private Integer descuentoCategoria;

    public Categoria(String nombreCategoria, Integer descuentoCategoria) {
        this.nombreCategoria = nombreCategoria;
        this.descuentoCategoria = descuentoCategoria;
    }
}
