package com.miproyecto.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miproyecto.portfolio.models.Usuario;
import com.miproyecto.portfolio.repository.UsuarioRepository;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    public UsuarioRepository usuarioRepo;

    @Override
    public List<Usuario> verUsuarios() {
        
        return usuarioRepo.findAll();
    }

    @Override
    public void crearUsuario(Usuario usuario) {
        
        usuarioRepo.save(usuario);
    }

    @Override
    public void borrarUsuario(Long idUsuario) {
        
        usuarioRepo.deleteById(idUsuario);
    }

    @Override
    public Usuario buscarUsuario(Long idUsuario) {
        
        return usuarioRepo.findById(idUsuario).orElse(null);
    }

    
}
