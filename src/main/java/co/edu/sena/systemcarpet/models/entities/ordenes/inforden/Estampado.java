package co.edu.sena.systemcarpet.models.entities.ordenes.inforden;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "estampados")
public class Estampado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estampado", nullable = false)
    private Integer idEstampado;

    @Column(name = "nombre_estampado",length = 30)
    private String nombreEstampado;

    @Column(name = "imagen_url",nullable = false)
    private String imagen_url;

    public Estampado(String nombreEstampado, String imagen_url) {
        this.nombreEstampado = nombreEstampado;
        this.imagen_url = imagen_url;
    }
}
