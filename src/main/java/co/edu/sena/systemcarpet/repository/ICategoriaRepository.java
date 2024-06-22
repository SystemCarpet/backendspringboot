package co.edu.sena.systemcarpet.repository;

import co.edu.sena.systemcarpet.model.inventario.productos.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoriaRepository extends JpaRepository<Categoria,Integer> {
}
