package com.miproyecto.portfolio.models;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter @Setter
@Entity
public class Tecnologia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long idTecnologia;
    private  String nombreTecnologia;
    private String urlImg;

    public Tecnologia(){}
    
    public Tecnologia(Long idTecnologia, String nombreTecnologia, String urlImg){
        this.idTecnologia = idTecnologia;
        this.nombreTecnologia = nombreTecnologia;
        this.urlImg = urlImg;
    }
    
}
