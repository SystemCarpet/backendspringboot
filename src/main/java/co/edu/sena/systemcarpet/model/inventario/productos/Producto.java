package co.edu.sena.systemcarpet.model.inventario.productos;

import co.edu.sena.systemcarpet.model.inventario.articulos.Articulo;
import co.edu.sena.systemcarpet.model.inventario.productos.infovehiculo.ModeloVehiculo;
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

    @Column(name = "precio_producto")
    private Double precio;

    @Column(name = "imagen_producto")
    private String imagenProducto;

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
