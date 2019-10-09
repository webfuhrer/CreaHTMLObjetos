/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectomovil;

/**
 *
 * @author CDMFP
 */
public class Movil {
    private String marca, modelo, gama;

    public Movil(String marca, String modelo, String gama) {
        this.marca = marca;
        this.modelo = modelo;
        this.gama = gama;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getGama() {
        return gama;
    }

    public void setGama(String gama) {
        this.gama = gama;
    }

    @Override
    public String toString() {
        return "Movil{" + "marca=" + marca + ", modelo=" + modelo + ", gama=" + gama + '}';
    }
    
}
