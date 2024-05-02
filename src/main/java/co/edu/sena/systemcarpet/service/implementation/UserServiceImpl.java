package co.edu.sena.systemcarpet.service.implementation;

import co.edu.sena.systemcarpet.model.actor.User;
import co.edu.sena.systemcarpet.repository.IUserRepository;
import co.edu.sena.systemcarpet.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserServiceImpl implements IUserService {


    private final IUserRepository iUserRepository;

    public UserServiceImpl(IUserRepository iUserRepository) {
        this.iUserRepository = iUserRepository;
    }


    @Override
    public List<User> getAllUsers() {
        return iUserRepository.findAll();
    }

    @Override
    public Optional<User> getUserById(Integer id) {
        return iUserRepository.findById(id);
    }

    @Override
    public void deleteUserById(Integer id) {
        iUserRepository.deleteById(id);

    }

    @Override
    public Optional<Integer> createUser(User user) {
        if (iUserRepository.findById(user.getId()).isEmpty()){
            iUserRepository.save(user);
            return user.getId().describeConstable();
        }
        return Optional.empty();
    }

    @Override
    public void updateUser(User user) {
        if (user.getId()!=null && existsById(user.getId())){
            iUserRepository.save(user);
        }
    }

    //R
    public boolean existsById(Integer id){
        return iUserRepository.existsById(id);
    }
}
