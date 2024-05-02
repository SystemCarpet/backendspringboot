package co.edu.sena.systemcarpet.service;

import co.edu.sena.systemcarpet.model.actor.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface IUserService {
        public List<User> getAllUsers();
        public Optional<User> getUserById(Integer id);
        public void deleteUserById(Integer id);
        public Optional<Integer> createUser(User user);
        public void updateUser(User user);

}
