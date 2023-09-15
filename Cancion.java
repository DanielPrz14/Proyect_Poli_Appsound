package com.mycompany.dto;

import java.util.ArrayList;

public class Cancion {
    // Clase que representa una canción.

    // Nombre de la canción.
    private String nombre;
    
    // Duración de la canción en segundos.
    private Integer duracion;
    
    // Género de la canción.
    private String genero;
    
    // Lista de artistas involucrados en la canción.
    private ArrayList<String> artista;
    
    // URL de la canción (ubicación o enlace para reproducir la canción).
    private String url;

    // Constructor que recibe todos los detalles de la canción.
    public Cancion(String nombre, Integer duracion, String genero, ArrayList<String> artista, String url) {
        // Inicializa los campos con los valores proporcionados.
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
        this.artista = artista;
        this.url = url;
    }

    // Constructor sin argumentos.
    public Cancion() {
        // Se utiliza cuando no se proporcionan detalles de la canción.
    }

    // Método para obtener el nombre de la canción.
    public String getNombre() {
        return nombre;
    }

    // Método para obtener la duración de la canción en segundos.
    public Integer getDuracion() {
        return duracion;
    }

    // Método para obtener el género de la canción.
    public String getGenero() {
        return genero;
    }

    // Método para obtener la lista de artistas involucrados en la canción.
    public ArrayList<String> getArtista() {
        return artista;
    }

    // Método para obtener la URL de la canción.
    public String getUrl() {
        return url;
    }

    // Método para establecer el nombre de la canción.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para establecer la duración de la canción en segundos.
    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    // Método para establecer el género de la canción.
    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Método para establecer la lista de artistas involucrados en la canción.
    public void setArtista(ArrayList<String> artista) {
        this.artista = artista;
    }

    // Método para establecer la URL de la canción.
    public void setUrl(String url) {
        this.url = url;
    }
}
