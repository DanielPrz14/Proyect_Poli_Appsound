package com.mycompany.dto;

import java.util.ArrayList;

public class Album {
    private ArrayList <Cancion> canciones;
    private Integer fechaSalida;
    private String nombreAlbum;
    public Album(ArrayList<Cancion> canciones, Integer fechaSalida) {
        this.canciones = canciones;
        this.fechaSalida = fechaSalida;
        this.nombreAlbum = nombreAlbum;
    }

    public Album() {
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public Integer getFechaSalida() {
        return fechaSalida;
    }

    public String getNombreAlbum() {
        return nombreAlbum;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public void setFechaSalida(Integer fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }
    
    public Integer getDuracion(){
        Integer duracion = 0;
        for (int index =0; index < canciones.size(); index ++){
             duracion += canciones.get(index).getDuracion();
        }        
        return duracion;
    }
}
