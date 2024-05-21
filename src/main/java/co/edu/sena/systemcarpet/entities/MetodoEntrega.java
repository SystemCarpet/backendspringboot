package co.edu.sena.systemcarpet.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "metodo_entrega")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MetodoEntrega implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_metodo_entrega")
    private Long id;

    @Column(name = "nombre_metodo_entrega", length = 30)
    private String nombre;

    @Column(name = "costo_metodo_entrega")
    private double costo;

}
