package co.edu.sena.systemcarpet.models.entities.proveedores;

import co.edu.sena.systemcarpet.models.entities.inventario.articulos.Articulo;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "precios_proveedor")
public class PrecioProveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_precio_proveedor", nullable = false)
    private Integer idPrecioProveedor;

    @Column(name = "precio_proveedor", nullable = false)
    private BigDecimal precioProveedor;

    @ManyToOne
    @JoinColumn(name = "articulo_id")
    private Articulo articulo;

    @ManyToOne
    @JoinColumn(name = "proveedor_id")
    private Proveedor proveedor;

    public PrecioProveedor(BigDecimal precioProveedor, Articulo articulo, Proveedor proveedor) {
        this.precioProveedor = precioProveedor;
        this.articulo = articulo;
        this.proveedor = proveedor;
    }
}
