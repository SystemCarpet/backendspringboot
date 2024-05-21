package co.edu.sena.systemcarpet.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "proveedores")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Proveedor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proveedor")
    private Long id;

    @Column(name = "nombre_proveedor", length = 30)
    private String nombre;

    @Column(name = "telefono_proveedor")
    private int telefono;

    @Column(name = "email_proveedor", length = 60)
    private String email;

    @ManyToOne
    @JoinColumn(name = "id_direccion")
    private Direccion direccionId;

}
