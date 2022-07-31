package com.miproyecto.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miproyecto.portfolio.models.Tecnologia;
import com.miproyecto.portfolio.repository.TecnologiaRepository;

@Service
public class TecnologiaService implements ITecnologiaService{


    @Autowired
    public TecnologiaRepository tecnoRepo;
    @Override
    public List<Tecnologia> verTecnologias() {
        
        return tecnoRepo.findAll();
    }

    @Override
    public void crearTecnologia(Tecnologia tecnologia) {
        
        tecnoRepo.save(tecnologia);
    }

    @Override
    public void borrarTecnologia(Long idTecnologia) {
        
        tecnoRepo.deleteById(idTecnologia);
    }

    @Override
    public Tecnologia buscarTecnologia(Long idTecnologia) {
        
        return tecnoRepo.findById(idTecnologia).orElse(null);
    }
    
}
