package co.edu.sena.systemcarpet.model.inventario.materiasprimas;

import co.edu.sena.systemcarpet.model.inventario.articulos.Articulo;
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
    @Column(name = "id_materia_prima")
    private Integer idMateriaPrima;

    @Column(name = "nombre_materia_prima", length = 30, nullable = false,unique = true)
    private String nombreMateriaPrima;

    @ManyToOne
    @JoinColumn(name = "articulo_id")
    private Articulo articulo;
}