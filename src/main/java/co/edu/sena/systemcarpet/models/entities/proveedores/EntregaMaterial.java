package co.edu.sena.systemcarpet.models.entities.proveedores;

import co.edu.sena.systemcarpet.models.entities.inventario.articulos.Articulo;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "entregas_materiales")
public class EntregaMaterial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_entrega_material", nullable = false)
    private Integer idEntregaMaterial;

    @Column(name = "fecha_entrega_material", nullable = false)
    private LocalDateTime fechaEntregaMaterial;

    @Column(name = "cantidad_entrega_material", nullable = false)
    private Integer cantidadEntregaMaterial;

    @ManyToOne
    @JoinColumn(name = "proveedor_id")
    private Proveedor proveedor;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(
            name = "entregas_articulos",
            joinColumns = @JoinColumn(name="entrega_material_id",referencedColumnName = "id_entrega_material"),
            inverseJoinColumns = @JoinColumn(name="articulo_id",referencedColumnName = "id_articulo")
    )
    private List<Articulo> articulos;

    public EntregaMaterial(LocalDateTime fechaEntregaMaterial, Integer cantidadEntregaMaterial, Proveedor proveedor) {
        this.fechaEntregaMaterial = fechaEntregaMaterial;
        this.cantidadEntregaMaterial = cantidadEntregaMaterial;
        this.proveedor = proveedor;
    }
}
