package co.edu.sena.systemcarpet.models.entities.inventario.productos;

import co.edu.sena.systemcarpet.models.entities.inventario.articulos.Articulo;
import co.edu.sena.systemcarpet.models.entities.inventario.productos.infvehiculo.ModeloVehiculo;
import co.edu.sena.systemcarpet.models.entities.ventas.Catalogo;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto", nullable = false)
    private Integer idProducto;

    @Column(name = "imagen_producto",unique = true)
    private String imagenProducto;

    @ManyToOne
    @JoinColumn(name = "articulo_id")
    private Articulo articulo;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "modelo_vehiculo_id")
    private ModeloVehiculo modeloVehiculo;

    @ManyToOne
    @JoinColumn(name = "catalogo_id")
    private Catalogo catalogo;

    public Producto(String imagenProducto, Articulo articulo, Categoria categoria, ModeloVehiculo modeloVehiculo, Catalogo catalogo) {
        this.imagenProducto = imagenProducto;
        this.articulo = articulo;
        this.categoria = categoria;
        this.modeloVehiculo = modeloVehiculo;
        this.catalogo = catalogo;
    }
}
