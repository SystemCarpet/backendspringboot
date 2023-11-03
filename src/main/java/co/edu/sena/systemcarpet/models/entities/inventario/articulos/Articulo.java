package co.edu.sena.systemcarpet.models.entities.inventario.articulos;

import co.edu.sena.systemcarpet.models.entities.ordenes.OrdenPersonalizada;
import co.edu.sena.systemcarpet.models.entities.proveedores.EntregaMaterial;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "articulos")
public class Articulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_articulo", nullable = false)
    private Integer idArticulo;

    @Column(name = "nombre_articulo", length = 30, nullable = false,unique = true)
    private String nombreArticulo;

    @Column(name = "cantidad_articulo", nullable = false)
    private Integer cantidadArticulo;

    @Column(name = "dimension_articulo", length = 30)
    private String dimensionArticulo;

    @Column(name = "descripcion_articulo", length = 100)
    private String descripcionArticulo;

    @Column(name = "precio_articulo", nullable = false)
    private BigDecimal precioArticulo;

    @ManyToOne
    @JoinColumn(name = "tipo_articulo_id")
    private TipoArticulo tipoArticulo;

    @ManyToOne
    @JoinColumn(name = "estado_articulo_id")
    private EstadoArticulo estadoArticulo;

    @ManyToMany(mappedBy = "articulos")
    @JsonIgnore
    private List<EntregaMaterial> entregaMateriales;

    @ManyToMany(mappedBy = "articulos")
    @JsonIgnore
    private List<OrdenPersonalizada> ordenPersonalizadas;

    public Articulo(String nombreArticulo, Integer cantidadArticulo, String dimensionArticulo, String descripcionArticulo, BigDecimal precioArticulo, TipoArticulo tipoArticulo, EstadoArticulo estadoArticulo) {
        this.nombreArticulo = nombreArticulo;
        this.cantidadArticulo = cantidadArticulo;
        this.dimensionArticulo = dimensionArticulo;
        this.descripcionArticulo = descripcionArticulo;
        this.precioArticulo = precioArticulo;
        this.tipoArticulo = tipoArticulo;
        this.estadoArticulo = estadoArticulo;
    }
}
