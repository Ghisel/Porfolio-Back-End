package com.miproyecto.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miproyecto.portfolio.models.Tecnologia;

@Repository
public interface TecnologiaRepository extends JpaRepository <Tecnologia, Long> {
    
}
