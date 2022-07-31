package com.miproyecto.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miproyecto.portfolio.models.Estudio;
import com.miproyecto.portfolio.repository.EstudioRepository;

@Service
public class EstudioService  implements IEstudioService{

@Autowired
public EstudioRepository estudioRepo;

    @Override
    public List<Estudio> verEstudios() {
        
        return estudioRepo.findAll();
    }

    @Override
    public void crearEstudio(Estudio estudio) {
        
        estudioRepo.save(estudio);
    }

    @Override
    public void borrarEstudio(Long idEstudio) {
        
        estudioRepo.deleteById(idEstudio);
    }

    @Override
    public Estudio buscarEstudio(Long idEstudio) {
        
        return estudioRepo.findById(idEstudio).orElse(null);
    }


    
}
