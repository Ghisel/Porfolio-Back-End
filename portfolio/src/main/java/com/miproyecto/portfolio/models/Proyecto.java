package com.miproyecto.portfolio.models;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter @Setter
@Entity
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long idProyecto;
    private String nombreProyecto;
    private String descripcion;
    private String urlImgProyecto;
    private String url;

    public Proyecto(){}

    public Proyecto(Long idProyecto, String nombreProyecto, String descripcion, String urlImgProyecto, String url){
        this.idProyecto = idProyecto;
        this.nombreProyecto = nombreProyecto;
        this.descripcion = descripcion;
        this.urlImgProyecto = urlImgProyecto;
        this.url = url;
    }

}
