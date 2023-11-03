package co.edu.sena.systemcarpet.models.entities.direcciones;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "barrios")
public class Barrio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_barrio", nullable = false)
    private Integer idBarrio;
    @Column(name = "nombre_barrio", length = 30, nullable = false,unique = true)
    private String nombreBarrio;
    @ManyToOne
    @JoinColumn(name = "localidad_id")
    private Localidad localidad;

    public Barrio(String nombreBarrio, Localidad localidad) {
        this.nombreBarrio = nombreBarrio;
        this.localidad = localidad;
    }
}
