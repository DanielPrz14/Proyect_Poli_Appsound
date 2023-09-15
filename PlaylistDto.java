package com.mycompany.dto;

import java.util.ArrayList;

public class PlaylistDto {
    private String nombrePlaylist;
    private ArrayList<Cancion> canciones;

    // Constructor de la clase PlaylistDto
    public PlaylistDto(String nombrePlaylist) {
        this.nombrePlaylist = nombrePlaylist;
        this.canciones = new ArrayList<>();
    }

    // Getter para obtener el nombre de la lista de reproducción
    public String getNombrePlaylist() {
        return nombrePlaylist;
    }

    // Setter para establecer el nombre de la lista de reproducción
    public void setNombrePlaylist(String nombrePlaylist) {
        this.nombrePlaylist = nombrePlaylist;
    }

    // Getter para obtener la lista de canciones de la lista de reproducción
    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    // Método para verificar si una canción ya está en la lista de reproducción
    public Boolean verificarCancion(Cancion cancion) {
        // Comprueba si la canción está en la lista de reproducción
        return !(this.canciones.indexOf(cancion) > -1);
    }

    // Método para agregar una canción a la lista de reproducción
    public void agregarCancion(Cancion cancion) {
        // Verifica si la canción no está en la lista antes de agregarla
        if (verificarCancion(cancion)) {
            this.canciones.add(cancion);
        }
    }

    // Método para eliminar una canción de la lista de reproducción
    public void eliminarCancion(Cancion cancion) {
        this.canciones.remove(cancion);
    }
}
