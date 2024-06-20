package co.edu.sena.SystemCarpet.model.inventario.productos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Integer idCategoria;

    @Column(name = "nombre_categoria", length = 30, nullable = false,unique = true)
    private String nombreCategoria;

    @Column(name = "descuento_categoria", nullable = false)
    private Double descuentoCategoria;
}