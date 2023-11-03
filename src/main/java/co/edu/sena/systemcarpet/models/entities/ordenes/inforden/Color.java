package co.edu.sena.systemcarpet.models.entities.ordenes.inforden;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "colores")
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_color", nullable = false)
    private Integer idColor;

    @Column(name = "nombre_color",length = 30, nullable = false,unique = true)
    private String nombreColor;

    public Color(String nombreColor) {
        this.nombreColor = nombreColor;
    }
}
