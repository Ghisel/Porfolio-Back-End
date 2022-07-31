package com.miproyecto.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miproyecto.portfolio.models.Domicilio;
import com.miproyecto.portfolio.repository.DomicilioRepository;

@Service
public class DomicilioService implements IDomicilioService{

    @Autowired
    public DomicilioRepository domRepo;

    @Override
    public List<Domicilio> verDomicilios() {
        
        return domRepo.findAll();
    }

    @Override
    public void crearDomicilio(Domicilio domicilio) {
        
        domRepo.save(domicilio);
    }

    @Override
    public void borrarDomicilio(Long idDomiclio) {
        
        domRepo.deleteById(idDomiclio);
    }

    @Override
    public Domicilio buscarDomicilio(Long idDomiclio) {
        
        return domRepo.findById(idDomiclio).orElse(null);
    }

    

}
