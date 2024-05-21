package co.edu.sena.systemcarpet.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "tipos_articulos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoArticulo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_articulo")
    private Long id;

    @Column(name = "nombre_tipo_articullo", length = 30)
    private String nombre;


}
