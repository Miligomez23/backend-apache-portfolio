package com.atly.porfolio.entity;

//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.validation.constraints.NotNull;
//import jakarta.validation.constraints.Size;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Id;

@Getter @Setter
@Entity
public class persona {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    
    @NotNull
    @Size(min=1, max=45, message= "no cumple con la longitud")
    private String name;
    
    @NotNull
    @Size(min=1, max=45, message= "no cumple con la longitud")
    private String alias;
    
    @NotNull
    @Size(min=1, max=45, message= "no cumple con la longitud")
    private String titulo;
    
    @NotNull
    @Size(min=1, max=200, message= "no cumple con la longitud")
    private String acercademi;
    
    @NotNull
    @Size(min=1, max=100, message= "no cumple con la longitud")
    private String bannerimg;
    
    @NotNull
    @Size(min=1, max=100, message= "no cumple con la longitud")
    private String imgpersona;
    
    @NotNull
    @Size(min=1, max=45, message= "no cumple con la longitud")
    private String nombrecontacto;
    
    @NotNull
    @Size(min=1, max=45, message= "no cumple con la longitud")
    private String contacto;
    @NotNull
    @Size(min=1, max=100, message= "no cumple con la longitud")
    private String mail;
}
