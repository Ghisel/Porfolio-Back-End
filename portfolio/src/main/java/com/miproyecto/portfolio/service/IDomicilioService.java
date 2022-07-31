package com.miproyecto.portfolio.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.miproyecto.portfolio.models.Domicilio;

@Service
public interface IDomicilioService {

    public List<Domicilio> verDomicilios();
    
    public void crearDomicilio(Domicilio domicilio);

    public void borrarDomicilio(Long idDomiclio);

    public Domicilio buscarDomicilio(Long idDomiclio);
    
}
