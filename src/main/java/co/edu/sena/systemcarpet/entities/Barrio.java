package co.edu.sena.systemcarpet.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "barrios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Barrio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_barrio")
    private Long id;

    @Column(name = "nombre_barrio", length = 25)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "id_localidad")
    private Localidad localidad_id;
}
