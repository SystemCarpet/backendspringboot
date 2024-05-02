package co.edu.sena.systemcarpet.repository;

import co.edu.sena.systemcarpet.model.actor.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Repository
public interface IUserRepository extends JpaRepository<User,Integer> {
}
