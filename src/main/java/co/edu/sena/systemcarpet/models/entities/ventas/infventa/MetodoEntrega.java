package co.edu.sena.systemcarpet.models.entities.ventas.infventa;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "metodo_entrega")
public class MetodoEntrega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_metodo_entrega", nullable = false)
    private Integer idMetodoPago;

    @Column(name = "nombre_metodo_entrega",length = 30, nullable = false,unique = true)
    private String nombreMetodoEntrega;

    @Column(name = "costo_metodo_entrega", nullable = false)
    private BigDecimal costoMetodoEntrega;

    public MetodoEntrega(String nombreMetodoEntrega, BigDecimal costoMetodoEntrega) {
        this.nombreMetodoEntrega = nombreMetodoEntrega;
        this.costoMetodoEntrega = costoMetodoEntrega;
    }
}
