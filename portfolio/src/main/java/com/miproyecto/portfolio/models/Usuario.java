package com.miproyecto.portfolio.models;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter @Setter
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long idUsuario;
    private String emailUsuario;
    private String clave;

    public Usuario(){}

    public Usuario(Long idUsuario, String emailUsuario, String clave){
        this.idUsuario = idUsuario;
        this.emailUsuario = emailUsuario;
        this.clave = clave;
    }
}

