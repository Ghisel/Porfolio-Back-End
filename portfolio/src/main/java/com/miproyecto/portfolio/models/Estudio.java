package com.miproyecto.portfolio.models;
import lombok.Getter;
import lombok.Setter;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter @Setter
@Entity
public class Estudio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private  Long idEstudio;
    private  String titulo;
    private  Date fechaInicio;
    private  Date fechaFin;
    private String egreso;
    private String institucion;
    private String urlImgEstudio;

    public Estudio(){}

    public Estudio(Long idEstudio, String titulo, Date fechaInicio, Date fechaFin, String egreso,String institucion, String urlImgEstudio){
        this.idEstudio = idEstudio;
        this.titulo = titulo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.egreso = egreso;
        this.institucion = institucion;
        this.urlImgEstudio = urlImgEstudio;
    }

    
}
    

	

    
