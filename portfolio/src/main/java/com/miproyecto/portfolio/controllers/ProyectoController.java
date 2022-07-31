package com.miproyecto.portfolio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.miproyecto.portfolio.models.Proyecto;
import com.miproyecto.portfolio.service.IProyectoService;

@RestController
public class ProyectoController {

@Autowired
private IProyectoService proyectoService;    

@PostMapping ("/new/proyecto")
    public void agregarProyecto (@RequestBody Proyecto proyect){
       proyectoService.crearProyecto(proyect);
    }
    
@GetMapping ("/ver/proyectos")
@ResponseBody    
    public List<Proyecto> verProyectos(){
       return proyectoService.verProyectos();
    }

    @GetMapping("/delete/proyecto")
    public void borrarProyecto(@PathVariable Long idProyecto){
        proyectoService.borrarProyecto(idProyecto);
    }
}
