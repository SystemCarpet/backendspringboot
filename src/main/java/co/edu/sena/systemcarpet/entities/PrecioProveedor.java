package co.edu.sena.systemcarpet.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "precios_proveedor")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrecioProveedor implements Serializable {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id_precio_proveedor")
    private Long id;

    @Column(name = "precio_proveedor")
    private double precio;

    @ManyToOne
    @JoinColumn(name = "id_articulo")
    private Articulo articulo_id;

    @ManyToOne
    @JoinColumn(name = "id_proveedor")
    private Proveedor proveedor_id;

}
