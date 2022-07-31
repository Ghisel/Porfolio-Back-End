package com.miproyecto.portfolio.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.miproyecto.portfolio.models.Estudio;
import com.miproyecto.portfolio.service.IEstudioService;

@RestController
public class EstudioController {
    
@Autowired
private IEstudioService estudioService;   

@PostMapping ("/new/estudio")
    public void agregarEstudio (@RequestBody Estudio est){
       estudioService.crearEstudio(est);
    }

@GetMapping ("/ver/estudios")
@ResponseBody
    public List<Estudio> verEstudios(){
        return estudioService.verEstudios();
    }

    @GetMapping("/delete/estudios")
    public void borrarEstudio(@PathVariable Long idEstudio){
        estudioService.borrarEstudio(idEstudio);
    }
}
