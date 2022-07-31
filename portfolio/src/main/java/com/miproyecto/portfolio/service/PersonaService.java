package com.miproyecto.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miproyecto.portfolio.models.Persona;
import com.miproyecto.portfolio.repository.PersonaRepository;

@Service
public class PersonaService implements IPersonaService{

    //@Autowired notacion que me permite realizar una inyeccion de dependencia
    @Autowired 
    public PersonaRepository persoRepo;


    @Override
    public List<Persona> verPersonas() {
        
        return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona persona) {
        
        persoRepo.save(persona);
    }

    @Override
    public void borrarPersona(Long idPersona) {
        
        persoRepo.deleteById(idPersona);
    }

    @Override
    public Persona buscarPersona(Long idPersona) {
        
        return persoRepo.findById(idPersona).orElse(null);
    }
    
}
