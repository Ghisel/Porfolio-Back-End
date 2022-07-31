package com.miproyecto.portfolio.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.miproyecto.portfolio.models.Usuario;
import com.miproyecto.portfolio.service.IUsuarioService;

@RestController
public class UsuarioController {

    @Autowired

    private IUsuarioService usuarioService;
    
    @PostMapping("/new/usuario")
    public void agregarUsuario(@RequestBody Usuario usuario) {
        usuarioService.crearUsuario(usuario);
    }

    @GetMapping("/ver/usuarios")
    @ResponseBody
        public List<Usuario> verUsuarios(){
            return usuarioService.verUsuarios();
        }

    @GetMapping("/delete/usuarios/")
    public void borrarUsuario(@PathVariable Long idUsuario){
        usuarioService.borrarUsuario(idUsuario);
    }    
}
