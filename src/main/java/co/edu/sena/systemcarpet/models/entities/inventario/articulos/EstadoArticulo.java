package co.edu.sena.systemcarpet.models.entities.inventario.articulos;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "estados_articulos")
public class EstadoArticulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estado_articulo", nullable = false)
    private Integer idEstadoArticulo;

    @Column(name = "nombre_estado_articulo", length = 30, nullable = false,unique = true)
    private String nombreEstadoArticulo;

    public EstadoArticulo(String nombreEstadoArticulo) {
        this.nombreEstadoArticulo = nombreEstadoArticulo;
    }
}
