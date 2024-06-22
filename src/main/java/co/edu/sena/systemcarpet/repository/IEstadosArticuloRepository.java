package co.edu.sena.systemcarpet.repository;

import co.edu.sena.systemcarpet.model.inventario.articulos.EstadosArticulo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstadosArticuloRepository extends JpaRepository<EstadosArticulo,Integer> {
}
