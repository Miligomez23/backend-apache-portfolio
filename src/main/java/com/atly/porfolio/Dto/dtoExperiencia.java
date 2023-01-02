
package com.atly.porfolio.Dto;

import javax.validation.constraints.NotBlank;


public class dtoExperiencia {
    @NotBlank
    private String lugar;
    @NotBlank
    private String donde;
    @NotBlank
    private String puesto;
    @NotBlank
    private String actividades;
    @NotBlank
    private String img;
    
    //constructor

    public dtoExperiencia() {
    }

    public dtoExperiencia(String lugar, String donde, String puesto, String actividades, String img) {
        this.lugar = lugar;
        this.donde = donde;
        this.puesto = puesto;
        this.actividades = actividades;
        this.img = img;
    }
 
    //getters and setters

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDonde() {
        return donde;
    }

    public void setDonde(String donde) {
        this.donde = donde;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getActividades() {
        return actividades;
    }

    public void setActividades(String actividades) {
        this.actividades = actividades;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

  
}
