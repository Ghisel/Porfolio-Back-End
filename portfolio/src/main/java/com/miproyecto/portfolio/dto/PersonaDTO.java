package com.miproyecto.portfolio.dto;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import java.util.Date;


@Getter @Setter

public class PersonaDTO implements Serializable {

    private Long idPersona;
    private String nombre;
    private String apellidos;
    private Date fechaNac;
    private String email;
    private String telefono;
    private String urlImgPersona;
    private String sobreMi;
    private  Long idEstudio;
    private  String titulo;
    private  Date fechaInicio;
    private  Date fechaFin;
    private String egreso;
    private String institucion;
    private String urlImgEstudio;
    private Long idProyecto;
    private String nombreProyecto;
    private String descripcion;
    private String urlImgProyecto;
    private String url;
    private Long idTecnologia;
    private  String nombreTecnologia;
    private String urlImg;
    private Long idUsuario;
    private String nombreUsuario;
    private String clave;

        public PersonaDTO(){}
        public PersonaDTO(Long idPersona, String nombre, String apellidos, Date fechaNac, String email, String telefono,
            String urlImgPersona, String sobreMi, Long idEstudio, String titulo, Date fechaInicio, Date fechaFin,
            String egreso, String institucion, String urlImgEstudio, Long idProyecto, String nombreProyecto,
            String descripcion, String urlImgProyecto, String url, Long idTecnologia, String nombreTecnologia,
            String urlImg, Long idUsuario, String nombreUsuario, String clave) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
        this.email = email;
        this.telefono = telefono;
        this.urlImgPersona = urlImgPersona;
        this.sobreMi = sobreMi;
        this.idEstudio = idEstudio;
        this.titulo = titulo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.egreso = egreso;
        this.institucion = institucion;
        this.urlImgEstudio = urlImgEstudio;
        this.idProyecto = idProyecto;
        this.nombreProyecto = nombreProyecto;
        this.descripcion = descripcion;
        this.urlImgProyecto = urlImgProyecto;
        this.url = url;
        this.idTecnologia = idTecnologia;
        this.nombreTecnologia = nombreTecnologia;
        this.urlImg = urlImg;
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
    }

    }


    
    

