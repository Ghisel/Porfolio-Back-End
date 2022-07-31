package com.miproyecto.portfolio.service;

import org.springframework.stereotype.Service;

import com.miproyecto.portfolio.models.Tecnologia;

import java.util.List;

@Service
public interface ITecnologiaService{

    public List<Tecnologia> verTecnologias();

    public void crearTecnologia(Tecnologia tecnologia);

    public void borrarTecnologia(Long idTecnologia);

    public Tecnologia buscarTecnologia(Long idTecnologia);
    
}
