package co.edu.sena.systemcarpet.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "marca_vehiculos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MarcaVehiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_marca_vehiculo")
    private Long id;

    @Column(name = "nombre_marca_vehiculo", length = 30)
    private String nombre;
}
