package com.mycompany.playlist;

import com.mycompany.dto.Cancion;
import com.mycompany.dto.PlaylistDto;
import com.mycompany.logica.Reproductor;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    // Instanciar un objeto de la clase Reproductor
    private static Reproductor reproductor = new Reproductor();

    public static void main(String[] args) {
        do {
            // Limpiar la consola
            System.out.print("\033[H\033[2J");
            System.out.flush();
        } while (!menu()); // Continuar mostrando el menú hasta que el usuario seleccione "Salir"
    }

    public static Boolean menu() {
        // Limpiar la consola
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Appsound");
        System.out.println("1. Reproducir canciones");
        System.out.println("2. Mis playlists");
        System.out.println("3. Salir");
        
        // Capturar la opción seleccionada por el usuario
        Scanner kb = new Scanner(System.in);
        String opcion = kb.nextLine();
        
        // Gestionar opciones
        if (opcion.equals("3")) {
            // Salir del programa
            return true;
        } else if (opcion.equals("1")) {
            // Mostrar la galería de canciones y permitir al usuario reproducirlas
            mostrarGaleria();
        } else if (opcion.equals("2")) {
            // Mostrar las playlists del usuario
            mostrarPlaylist();
        } // Opción inválida
        else {
            System.out.println("Selecciona una opción válida");
        }
        return false;
    }

    public static void mostrarGaleria() {
        // Limpiar la consola
        System.out.print("\033[H\033[2J");
        System.out.flush();
        AtomicInteger ordinal = new AtomicInteger(1);
        
        // Mostrar la lista de canciones disponibles
        reproductor.getGaleria().forEach(cancion -> {
            System.out.println("" + ordinal.toString() + ". - " + cancion.getNombre() + " | " + cancion.getArtista());
            ordinal.getAndIncrement();
        });
        
        System.out.println("Selecciona el número de una canción para reproducirla ");
        Scanner kb = new Scanner(System.in);
        String cancion = kb.nextLine();
        
        // Reproducir la canción seleccionada por el usuario
        reproductor.play(reproductor.getGaleria().get(Integer.parseInt(cancion) - 1));
    }

    public static void mostrarPlaylist() {
        // Limpiar la consola
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Selecciona una playlist ");
        AtomicInteger ordinal = new AtomicInteger(1);
        
        // Mostrar las playlists del usuario
        reproductor.getPlaylist().forEach(playlist -> {
            System.out.println("" + ordinal.toString() + ". - " + playlist.getNombrePlaylist());
            ordinal.getAndIncrement();
        });
        
        System.out.println("" + ordinal.toString() + ". Crear playlist");
        Scanner kb = new Scanner(System.in);
        int opcion = Integer.parseInt(kb.nextLine());
        
        if (reproductor.getPlaylist().size() == (opcion - 1)) {
            // Crear una nueva playlist si se selecciona la opción correspondiente
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Digita el nombre de la playlist");
            Scanner kbPlay = new Scanner(System.in);
            String nombrePlaylist = kbPlay.nextLine();
            reproductor.crearPlayist(nombrePlaylist);
        } else {
            // Mostrar el menú de una playlist seleccionada
            menuPlaylist(opcion);
        }
    }

    public static void menuPlaylist(Integer opcion) {
        // Limpiar la consola
        System.out.print("\033[H\033[2J");
        System.out.flush();
        AtomicInteger ordinal = new AtomicInteger(1);
        
        // Obtener la playlist seleccionada por el usuario
        PlaylistDto playlistSeleccionada = reproductor.getPlaylist().get((opcion - 1));
        
        // Mostrar las canciones de la playlist
        playlistSeleccionada.getCanciones().forEach(cancion -> {
            System.out.println("" + ordinal.toString() + ". - " + cancion.getNombre() + " | " + cancion.getArtista());
            ordinal.getAndIncrement();
        });
        
        System.out.println("1. Para agregar canción");
        System.out.println("2. Volver al menú principal");
        Scanner kb = new Scanner(System.in);
        int opcionMenu = Integer.parseInt(kb.nextLine());
        
        if (opcionMenu == 1) {
            // Agregar una canción a la playlist
            System.out.print("\033[H\033[2J");
            System.out.flush();
            AtomicInteger ordinalCanciones = new AtomicInteger(1);
            ArrayList<Cancion> filtrados = reproductor.filtradoPlay(playlistSeleccionada.getCanciones());
            filtrados.forEach(cancion -> {
                System.out.println("" + ordinalCanciones.toString() + ". - " + cancion.getNombre() + " | " + cancion.getArtista());
                ordinalCanciones.getAndIncrement();
            });
            System.out.println(ordinalCanciones.toString() +". para volver");
            Scanner kb2 = new Scanner(System.in);
            int opcionAddCancion = Integer.parseInt(kb2.nextLine());
            if (opcionAddCancion - 1 == filtrados.size()) {
                menuPlaylist(opcion);
            } else {
                Cancion cancion = filtrados.get(opcionAddCancion - 1);
                playlistSeleccionada.agregarCancion(cancion);
            }
        }
    }
}
