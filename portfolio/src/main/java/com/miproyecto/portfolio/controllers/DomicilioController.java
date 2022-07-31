package com.miproyecto.portfolio.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.miproyecto.portfolio.models.Domicilio;
import com.miproyecto.portfolio.service.IDomicilioService;

@RestController
public class DomicilioController {
    
@Autowired
private IDomicilioService domicilioService;


    @PostMapping("/new/domicilio")    
    public void agregarDomicilio (@RequestBody Domicilio dom){
        domicilioService.crearDomicilio(dom);
    }

    @GetMapping ("/ver/domicilios")
    @ResponseBody
    public List<Domicilio> verDomicilios(){
        return domicilioService.verDomicilios();
    }

    @GetMapping ("/delete/domicilio")
    public void borrarDomicilio(@PathVariable Long idDomicilio){
        domicilioService.borrarDomicilio(idDomicilio);
    }
}
