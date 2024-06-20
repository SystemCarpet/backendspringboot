package co.edu.sena.SystemCarpet.repository;

import co.edu.sena.SystemCarpet.model.actores.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario,Integer> {
}
