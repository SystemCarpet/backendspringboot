package co.edu.sena.systemcarpet.models.entities.direcciones;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "localidades")
public class Localidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_localidad", nullable = false)
    private Integer idLocalidad;

    @Column(name = "nombre_localidad", length = 30, nullable = false,unique = true)
    private String nombreLocalidad;

    public Localidad(String nombreLocalidad) {
        this.nombreLocalidad = nombreLocalidad;
    }
}
