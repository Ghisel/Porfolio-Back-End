package com.miproyecto.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miproyecto.portfolio.models.Domicilio;

@Repository
public interface DomicilioRepository extends JpaRepository<Domicilio, Long>{
    
}
