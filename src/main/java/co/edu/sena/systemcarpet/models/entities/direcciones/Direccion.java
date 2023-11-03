package co.edu.sena.systemcarpet.models.entities.direcciones;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "direcciones")
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_direccion", nullable = false)
    private Integer idDireccion;
    @Column(name = "detalles_direccion", length = 100, nullable = false)
    private String detalleDireccion;
    @ManyToOne
    @JoinColumn(name = "barrio_id")
    private Barrio barrio;

    public Direccion(String detalleDireccion, Barrio barrio) {
        this.detalleDireccion = detalleDireccion;
        this.barrio = barrio;
    }
}