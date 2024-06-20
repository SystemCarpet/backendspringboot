package co.edu.sena.SystemCarpet.model.proveedores;

import co.edu.sena.SystemCarpet.model.inventario.materiasprimas.MateriaPrima;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "materia_por_proveedor")
public class MateriaPorProveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proveedor_id", nullable = false)
    private Integer idProveedorId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "materia_prima_id", nullable = false)
    private Integer materiaPrimaId;

    @Column(name = "precio_unitario", nullable = false)
    private Double precioUnitario;

    @ManyToOne
    @JoinColumn(name = "id_proveedor_id", insertable = false, updatable = false)
    private Proveedor proveedores;

    @ManyToOne
    @JoinColumn(name = "materia_prima_id", insertable = false, updatable = false)
    private MateriaPrima materiaPrima;
}