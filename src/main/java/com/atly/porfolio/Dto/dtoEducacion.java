/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atly.porfolio.Dto;

import javax.validation.constraints.NotBlank;

public class dtoEducacion {
    
    private String curso;
    
    @NotBlank
    private String dequien;
    @NotBlank
    private String finalizado;
    @NotBlank
    private String img;
    @NotBlank
    private String titulo;

    public dtoEducacion() {
    }

    public dtoEducacion(String curso, String dequien, String finalizado, String img, String titulo) {
        this.curso = curso;
        this.dequien = dequien;
        this.finalizado = finalizado;
        this.img = img;
        this.titulo = titulo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDequien() {
        return dequien;
    }

    public void setDequien(String dequien) {
        this.dequien = dequien;
    }

    public String getFinalizado() {
        return finalizado;
    }

    public void setFinalizado(String finalizado) {
        this.finalizado = finalizado;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
}