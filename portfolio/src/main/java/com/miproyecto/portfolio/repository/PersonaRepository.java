package com.miproyecto.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.miproyecto.portfolio.models.Persona;


@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long> {
    
}
