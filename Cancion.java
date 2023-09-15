
package com.mycompany.dto;

import java.util.ArrayList;

/**
 *
 * @author wd_pe
 */
public class Cancion {
     private String nombre;
     private Integer duracion;
     private String genero;
     private ArrayList<String> artista;
     private String url;

    public Cancion(String nombre, Integer duracion, String genero, ArrayList<String> artista, String url) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
        this.artista = artista;
        this.url = url;
    }

    public Cancion() {
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public String getGenero() {
        return genero;
    }

    public ArrayList<String> getArtista() {
        return artista;
    }

    public String getUrl() {
        return url;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setArtista(ArrayList<String> artista) {
        this.artista = artista;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
