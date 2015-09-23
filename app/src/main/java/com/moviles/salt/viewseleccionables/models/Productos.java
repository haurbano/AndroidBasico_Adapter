package com.moviles.salt.viewseleccionables.models;

/**
 * Created by Diana M on 23/09/2015.
 */
public class Productos {

    String titulo;
    String precio;
    int caracteristicas;

    public Productos(String titulo, String precio, int caracteristicas) {
        this.titulo = titulo;
        this.precio = precio;
        this.caracteristicas = caracteristicas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(int caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
}
