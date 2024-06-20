package co.edu.sena.SystemCarpet.model.inventario.articulos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
@Table(name = "articulo")
public class Articulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_articulo")
    private Integer idArticulo;

    @Column(name = "nombre_articulo", length = 30, nullable = false,unique = true)
    private String nombreArticulo;

    @Column(name = "descripcion", length = 200, nullable = false)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "estado_articulo_id")
    private EstadosArticulo estadoArticulo;

    @ManyToOne
    @JoinColumn(name = "tipo_articulo_id")
    private TiposArticulo tipoArticulo;
}