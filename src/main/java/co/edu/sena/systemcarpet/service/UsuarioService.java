package co.edu.sena.systemcarpet.service;

import co.edu.sena.systemcarpet.model.actores.Usuario;
import co.edu.sena.systemcarpet.repository.IUsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UsuarioService {

    private final IUsuarioRepository usuarioRepository;

    public UsuarioService(IUsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }


    //R
    public List<Usuario> getAllUsuarios(){
        return usuarioRepository.findAll();
    }
    //R
    public Optional<Usuario> getUsuarioById(Integer id){
        return usuarioRepository.findById(id);
    }
    //R
    public boolean existsById(Integer id){
        return usuarioRepository.existsById(id);
    }
    //D
    public boolean deleteUsuarioById(Integer id){
        if(usuarioRepository.findById(id).isPresent()){
            usuarioRepository.deleteById(id);
            return true;
        }
        return false;
    }
    //C
    public Optional<Usuario> addUsuario(Usuario usuario){
        if (usuarioRepository.findById(usuario.getIdUsuario()).isEmpty()){
            usuarioRepository.save(usuario);
            return Optional.of(usuario);
        }
        return Optional.empty();
    }
    //U

    public Optional<Integer> updateUsuario(Usuario usuario){
        if (existsById(usuario.getIdUsuario())){
            return Optional.of(this.usuarioRepository.save(usuario).getIdUsuario());
        }
        return Optional.empty();
    }
}
