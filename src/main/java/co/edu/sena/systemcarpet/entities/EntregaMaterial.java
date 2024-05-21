package co.edu.sena.systemcarpet.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "entrega_materiales")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EntregaMaterial implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_entrega_material")
    private Long id;

    @Column(name = "fecha_entrega_material")
    private Date fechaEntrega;

    @Column(name = "cantidad_entrega_material")
    private int cantidad;

    @ManyToMany(mappedBy = "entregaMaterialList")
    private List<Articulo> articuloList;

}
