package com.miproyecto.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miproyecto.portfolio.models.Estudio;

@Repository
public interface EstudioRepository extends JpaRepository<Estudio, Long> {
    
}
