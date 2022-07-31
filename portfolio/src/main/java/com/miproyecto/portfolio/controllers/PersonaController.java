package com.miproyecto.portfolio.controllers;



import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.miproyecto.portfolio.models.Persona;
import com.miproyecto.portfolio.service.IPersonaService;

@RestController
public class PersonaController {


@Autowired

//implementacion de la interface de nuestro servicios 
private IPersonaService personaService;

	
	
@PostMapping ("/new/persona")
	public void agregarPersona (@RequestBody Persona per){
		personaService.crearPersona(per);
		
	}

@GetMapping ("/ver/personas")
@ResponseBody	
	public List<Persona> verPersonas (){
		return personaService.verPersonas();
	}

	@GetMapping("/delete/{idPersona}")
	public void borrarPersona(@PathVariable Long idPersona){
		personaService.borrarPersona(idPersona);

	}
}
