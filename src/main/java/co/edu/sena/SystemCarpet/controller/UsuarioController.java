package co.edu.sena.SystemCarpet.controller;


import co.edu.sena.SystemCarpet.model.actores.Usuario;
import co.edu.sena.SystemCarpet.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }


    @GetMapping
    public List<Usuario> getAllUsuarios(){
        return usuarioService.getAllUsuarios();
    }
    @GetMapping({"/{id}","/{id}/update","/{id}/delete"})
    public Optional<Usuario> getUsuarioById(@PathVariable("id") Integer id){
        return usuarioService.getUsuarioById(id);
    }
    @PostMapping("/add")
    public Optional<Usuario> addUsuario(@RequestBody Usuario usuario){
        return usuarioService.addUsuario(usuario);
    }
    @PatchMapping("/{id}/update")
    public Optional<Usuario> updateUsuario(@RequestBody Usuario usuario, @PathVariable Integer id){
        if (usuarioService.existsById(id)){
            usuarioService.updateUsuario(usuario);
            return usuarioService.getUsuarioById(id);
        }else {
            return Optional.empty();
        }

    }
    @DeleteMapping("/{id}/delete")
    public Optional<Usuario> deleteUsuarioById(@PathVariable("id")Integer id){
        if (usuarioService.existsById(id)){
            Optional<Usuario> del = usuarioService.getUsuarioById(id);
            usuarioService.deleteUsuarioById(id);
            return del;
        }
        return Optional.empty();
    }
}
