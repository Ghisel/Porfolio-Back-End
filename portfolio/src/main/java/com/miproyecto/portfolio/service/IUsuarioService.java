package com.miproyecto.portfolio.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.miproyecto.portfolio.models.Usuario;

@Service
public interface IUsuarioService {

    public List<Usuario> verUsuarios();

    public void crearUsuario(Usuario usuario);

    public void borrarUsuario(Long idUsuario);

    public Usuario buscarUsuario(Long idUsuario);
    
}
