
package com.mycompany.dto;

import java.util.ArrayList;

public class PlaylistDto {
    private String nombrePlaylist;
    private ArrayList <Cancion> canciones; 

    public PlaylistDto(String nombrePlaylist) {
        this.nombrePlaylist = nombrePlaylist;
        this.canciones = new ArrayList<>();
    }

    public String getNombrePlaylist() {
        return nombrePlaylist;
    }

    public void setNombrePlaylist(String nombrePlaylist) {
        this.nombrePlaylist = nombrePlaylist;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public Boolean verificarCancion(Cancion cancion) {
        return !(this.canciones.indexOf(cancion) >-1);
    }
    
    public void agregarCancion(Cancion cancion){
        if(verificarCancion(cancion)){
            this.canciones.add(cancion);
        }
    }
    public void eliminarCancion(Cancion cancion){
      this.canciones.remove(cancion);
      }
}
