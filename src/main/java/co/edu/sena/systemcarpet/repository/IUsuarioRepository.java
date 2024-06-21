package co.edu.sena.systemcarpet.repository;

import co.edu.sena.systemcarpet.model.actores.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario,Integer> {
}
