package com.miproyecto.portfolio.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.miproyecto.portfolio.models.Proyecto;

@Service
public interface IProyectoService {

    public List<Proyecto> verProyectos();

    public void crearProyecto(Proyecto proyecto);

    public void borrarProyecto(Long idProyecto);

    public Proyecto buscarProyecto(Long idProyecto);
    
}
