package com.miproyecto.portfolio.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.miproyecto.portfolio.models.Estudio;

@Service
public interface IEstudioService {

    public List<Estudio> verEstudios();

    public void crearEstudio(Estudio estudio);

    public void borrarEstudio(Long idEstudio);

    public Estudio buscarEstudio(Long idEstudio);
    
}
