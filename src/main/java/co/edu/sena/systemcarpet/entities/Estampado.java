package co.edu.sena.systemcarpet.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "estampados")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Estampado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estampados")
    private Long id;

    @Column(name = "nombre_estampado", length = 30)
    private String nombre;

    @Column(name = "imagen_url")
    private String imagen;
}
