package com.miproyecto.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miproyecto.portfolio.models.Proyecto;
import com.miproyecto.portfolio.repository.ProyectoRepository;

@Service
public class ProyectoService implements IProyectoService{


    @Autowired
    public ProyectoRepository proyectoRepo;

    @Override
    public List<Proyecto> verProyectos() {
        
        return proyectoRepo.findAll();
    }

    @Override
    public void crearProyecto(Proyecto proyecto) {
        
        proyectoRepo.save(proyecto);
    }

    @Override
    public void borrarProyecto(Long idProyecto) {
        
        proyectoRepo.deleteById(idProyecto);
    }

    @Override
    public Proyecto buscarProyecto(Long idProyecto) {
        
        return proyectoRepo.findById(idProyecto).orElse(null);
    }
    
}
