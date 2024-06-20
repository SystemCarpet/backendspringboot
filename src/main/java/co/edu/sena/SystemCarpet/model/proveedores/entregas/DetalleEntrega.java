package co.edu.sena.SystemCarpet.model.proveedores.entregas;

import co.edu.sena.SystemCarpet.model.inventario.materiasprimas.MateriaPrima;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "detalles_entrega")
public class DetalleEntrega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_material_entrega", nullable = false)
    private Integer idMaterialEntrega;

    @Column(name = "cantidad_entregada", nullable = false)
    private Integer cantidadEntregada;

    @ManyToOne
    @JoinColumn(name = "entrega_id")
    private Entrega entrega;

    @ManyToOne
    @JoinColumn(name = "materia_prima_id")
    private MateriaPrima materiasPrimas;
}