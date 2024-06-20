package co.edu.sena.SystemCarpet.model.direcciones;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "barrio")
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
}