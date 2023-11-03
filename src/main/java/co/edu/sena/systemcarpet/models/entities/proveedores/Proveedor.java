package co.edu.sena.systemcarpet.models.entities.proveedores;

import co.edu.sena.systemcarpet.models.entities.direcciones.Direccion;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "proveedores")
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proveedor", nullable = false)
    private Integer idProveedor;

    @Column(name = "nombre_proveedor",length = 30, nullable = false)
    private String nombreProveedor;

    @Column(name = "telefono_proveedor",length = 10, nullable = false,unique = true)
    private String telefonoProveedor;

    @Column(name = "email_proveedor",length = 60, nullable = false,unique = true)
    private String correoProveedor;

    @ManyToOne
    @JoinColumn(name = "direccion_id")
    private Direccion direccion;

    public Proveedor(String nombreProveedor, String telefonoProveedor, String correoProveedor, Direccion direccion) {
        this.nombreProveedor = nombreProveedor;
        this.telefonoProveedor = telefonoProveedor;
        this.correoProveedor = correoProveedor;
        this.direccion = direccion;
    }
}
