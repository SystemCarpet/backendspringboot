package co.edu.sena.systemcarpet.service;

import co.edu.sena.systemcarpet.entities.Usuario;
import co.edu.sena.systemcarpet.repositories.UsuarioRepository;
import co.edu.sena.systemcarpet.service.daoServices.DaoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService implements DaoServices<Usuario, Long> {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Override
    public List<Usuario> fAll() {
        return this.usuarioRepository.findAll();
    }

    @Override
    public Usuario fById(Long id) {
        return this.usuarioRepository.getById(id);
    }

    @Override
    public int save(Usuario obje) {
        this.usuarioRepository.save(obje);
        return 1;
    }

    @Override
    public int delete(Usuario obje) {
        this.usuarioRepository.delete(obje);
        return 1;
    }

    @Override
    public int update(Usuario obje) {
        return 0;
    }
}
