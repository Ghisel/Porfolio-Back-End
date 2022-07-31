package com.miproyecto.portfolio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.miproyecto.portfolio.models.Tecnologia;
import com.miproyecto.portfolio.service.ITecnologiaService;



@RestController
public class TecnologiaController {
   @Autowired
   private ITecnologiaService tecnologiaService;

@PostMapping ("/new/tecnologia")
    public void agregarTecnologia (@RequestBody Tecnologia tec){
        tecnologiaService.crearTecnologia(tec);
    }

    @GetMapping ("/ver/tecnologias")
    @ResponseBody
    public List<Tecnologia> verTecnologias (){
        return tecnologiaService.verTecnologias();
    }    

    @GetMapping("/delete/{idTecnologia}")
	public void borrarTecnologia(@PathVariable Long idTecnologia){
		tecnologiaService.borrarTecnologia(idTecnologia);

	}
}
