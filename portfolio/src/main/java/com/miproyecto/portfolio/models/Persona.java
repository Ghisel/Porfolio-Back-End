package com.miproyecto.portfolio.models;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long idPersona;
    private String nombre;
    private String apellidos;
    private Date fechaNac;
    private String email;
    private String telefono;
    private String urlImgPersona;
    private String sobreMi;
   

    public Persona(){}
    
    public Persona(Long idPersona, String nombre, String apellidos,Date fechaNac, String email, String telefono, String urlImgPersona, String sobreMi){
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
        this.email = email;
        this.telefono = telefono;
        this.urlImgPersona = urlImgPersona;
        this.sobreMi = sobreMi;
        
        
    }    
}
