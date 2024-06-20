package co.edu.sena.SystemCarpet.model.proveedores.entregas;

import co.edu.sena.SystemCarpet.model.proveedores.Proveedor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "entrega")
public class Entrega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_entrega", nullable = false)
    private Integer idEntrega;

    @Column(name = "fecha_entrega", nullable = false)
    private Date fechaEntrega;

    @Column(name = "precio_total", nullable = false)
    private Double precioTotal;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Proveedor proveedor;
}