package co.edu.sena.SystemCarpet.model.inventario.articulos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "estados_articulo")
public class EstadosArticulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estado_articulo", nullable = false)
    private Integer idEstadoArticulo;

    @Column(name = "nombre_estado_articulo", length = 30, nullable = false,unique = true)
    private String nombreEstadoArticulo;

    public EstadosArticulo(String nombreEstadoArticulo) {
        this.nombreEstadoArticulo = nombreEstadoArticulo;
    }
}