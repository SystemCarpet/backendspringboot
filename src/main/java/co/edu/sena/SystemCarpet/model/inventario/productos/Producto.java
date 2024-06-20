package co.edu.sena.SystemCarpet.model.inventario.productos;

import co.edu.sena.SystemCarpet.model.inventario.articulos.Articulo;
import co.edu.sena.SystemCarpet.model.inventario.productos.Categoria;
import co.edu.sena.SystemCarpet.model.inventario.productos.infovehiculo.ModeloVehiculo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProducto;

    @Column(name = "nombre_producto", length = 30, nullable = false, unique = true)
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
}
