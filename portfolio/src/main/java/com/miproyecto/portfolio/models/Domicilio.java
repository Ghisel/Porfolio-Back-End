package com.miproyecto.portfolio.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Domicilio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long idDomicilio;
    private String ciudad;
    private String localidad;
    private String codigoPostal;
    
    public Domicilio(){}

    public Domicilio(Long idDomicilio, String ciudad, String localidad, String codigoPostal){
        this.idDomicilio = idDomicilio;
        this.ciudad = ciudad;
        this.localidad = localidad;
        this.codigoPostal = codigoPostal;
    }

}

