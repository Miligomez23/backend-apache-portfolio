
package com.atly.porfolio.Dto;



public class dtoPersona {
    
    private String name;
    private String alias;
    private String titulo;
    private String acercademi;
    private String bannerimg;
    private String imgpersona;
    private String nombrecontacto;
    private String contacto;
    private String mail;

    public dtoPersona() {
    }

    public dtoPersona(String name, String alias, String titulo, String acercademi, String bannerimg, String imgpersona, String nombrecontacto, String contacto, String mail) {
        this.name = name;
        this.alias = alias;
        this.titulo = titulo;
        this.acercademi = acercademi;
        this.bannerimg = bannerimg;
        this.imgpersona = imgpersona;
       this.nombrecontacto = nombrecontacto;
        this.contacto = contacto;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAcercademi() {
        return acercademi;
    }

    public void setAcercademi(String acercademi) {
        this.acercademi = acercademi;
    }

    public String getBannerimg() {
        return bannerimg;
    }

    public void setBannerimg(String bannerimg) {
        this.bannerimg = bannerimg;
    }

    public String getImgpersona() {
        return imgpersona;
    }

    public void setImgpersona(String imgpersona) {
        this.imgpersona = imgpersona;
    }

    public String getNombrecontacto() {
       return nombrecontacto;
    }

    public void setNombrecontacto(String nombrecontacto) {
       this.nombrecontacto = nombrecontacto;
    }

   public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    

}
