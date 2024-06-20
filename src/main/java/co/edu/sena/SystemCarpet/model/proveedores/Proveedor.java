package co.edu.sena.SystemCarpet.model.proveedores;

import co.edu.sena.SystemCarpet.model.direcciones.Direccion;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "proveedores")
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proveedor", nullable = false)
    private Integer idProveedor;

    @Column(name = "nombre_proveedor", length = 30, nullable = false,unique = true)
    private String nombreProveedor;

    @Column(name = "email_proveedor", length = 50, nullable = false,unique = true)
    private String emailProveedor;

    @Column(name = "telefono_proveedor", length = 15, nullable = false,unique = true)
    private String telefonoProveedor;

    @ManyToOne
    @JoinColumn(name = "direccion_id")
    private Direccion direccion;
}