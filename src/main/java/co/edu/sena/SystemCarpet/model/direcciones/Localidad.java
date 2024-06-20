package co.edu.sena.SystemCarpet.model.direcciones;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "localidad")
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