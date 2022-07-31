package com.miproyecto.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miproyecto.portfolio.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
    
}
