
package com.atly.porfolio.Dto;

public class dtoHys {
    private String habilidad;
    private String porcentaje;
    
    private String tiempo;

    public dtoHys() {
    }

    public dtoHys(String habilidad, String porcentaje, String tiempo) {
        this.habilidad = habilidad;
        this.porcentaje = porcentaje;
        this.tiempo = tiempo;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }
       
}
