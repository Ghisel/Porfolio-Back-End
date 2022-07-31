package com.miproyecto.portfolio.service;

import org.springframework.stereotype.Service;

import com.miproyecto.portfolio.models.Persona;


import java.util.List;

@Service
public interface IPersonaService {

    public List<Persona> verPersonas();

    public void crearPersona(Persona persona);

    public void borrarPersona(Long idPersona);
    
    public Persona buscarPersona(Long idPersona);
    
}
