package co.edu.sena.SystemCarpet.model.inventario.productos;

import co.edu.sena.SystemCarpet.model.inventario.productos.infovehiculo.ModeloVehiculo;
import co.edu.sena.SystemCarpet.model.inventario.articulos.Articulo;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto", nullable = false)
    private Integer idProducto;

    @Column(name = "nombre_producto", length = 30, nullable = false,unique = true)
    private String nombreProducto;

    @Column(name = "precio", nullable = false)
    private Double precio;

    @ManyToOne
    @JoinColumn(name = "modelo_vehiculo_id")
    private ModeloVehiculo modeloVehiculo;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "articulo_id")
    private Articulo articulo;

    public Producto(String nombreProducto, Double precio, ModeloVehiculo modeloVehiculo, Categoria categoria, Articulo articulo) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.modeloVehiculo = modeloVehiculo;
        this.categoria = categoria;
        this.articulo = articulo;
    }
}