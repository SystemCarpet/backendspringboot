package co.edu.sena.SystemCarpet.model.inventario.materiasprimas;

import co.edu.sena.SystemCarpet.model.inventario.articulos.Articulo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "materias_primas")
public class MateriaPrima {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_materia_prima", nullable = false)
    private Integer idMateriaPrima;

    @Column(name = "nombre_materia_prima", length = 30, nullable = false,unique = true)
    private String nombreMateriaPrima;

    @ManyToOne
    @JoinColumn(name = "articulo_id")
    private Articulo articulo;
}