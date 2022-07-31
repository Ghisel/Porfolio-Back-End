package com.miproyecto.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miproyecto.portfolio.models.Proyecto;

@Repository
public interface ProyectoRepository extends JpaRepository <Proyecto, Long> {
    
}
