package co.edu.sena.SystemCarpet.model.direcciones;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "direccion")
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_direccion", nullable = false)
    private Integer idDireccion;

    @Column(name = "detalles", length = 200, nullable = false)
    private String detalles;

    @ManyToOne
    @JoinColumn(name = "barrio_id")
    private Barrio barrio;

    public Direccion(String detalles, Barrio barrio) {
        this.detalles = detalles;
        this.barrio = barrio;
    }
}