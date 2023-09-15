package com.mycompany.logica;

import com.mycompany.dto.Cancion;
import com.mycompany.dto.PlaylistDto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Reproductor {
    // La clase Reproductor mantiene una galería de canciones predefinidas y listas de reproducción

    private ArrayList<Cancion> galeria = Precarga.initBodegaCanciones(); // Inicializa la galería de canciones con datos predefinidos
    private ArrayList<PlaylistDto> playlist = new ArrayList<>(); // Lista de listas de reproducción

    // Método para reproducir una canción
    public void play(Cancion cancion) {
        try {
            // Abre la URL de la canción en el reproductor predeterminado
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + cancion.getUrl());
        } catch (IOException ex) {
            Logger.getLogger(Reproductor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Getter para obtener la galería de canciones
    public ArrayList<Cancion> getGaleria() {
        return galeria;
    }

    // Getter para obtener la lista de listas de reproducción
    public ArrayList<PlaylistDto> getPlaylist() {
        return playlist;
    }

    // Método para filtrar canciones que no están en una lista de reproducción
    public ArrayList<Cancion> filtradoPlay(ArrayList<Cancion> playListExistentes) {
        ArrayList<Cancion> filtradoGaleria = new ArrayList<>();
        galeria.forEach(cancion -> {
            if (!playListExistentes.contains(cancion)) {
                filtradoGaleria.add(cancion);
            }
        });
        return filtradoGaleria;
    }

    // Método para crear una nueva lista de reproducción
    public void crearPlayist(String nombre) {
        playlist.add(new PlaylistDto(nombre));
    }
}
