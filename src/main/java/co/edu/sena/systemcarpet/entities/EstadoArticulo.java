package co.edu.sena.systemcarpet.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "estados_articulos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EstadoArticulo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estado_articulo")
    private Long id;

    @Column(name = "nombre_estado_articulo", length = 30)
    private String nombre;

}
