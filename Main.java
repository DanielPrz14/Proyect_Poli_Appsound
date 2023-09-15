package com.mycompany.playlist;

import com.mycompany.dto.Cancion;
import com.mycompany.dto.PlaylistDto;
import com.mycompany.logica.Reproductor;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    private static Reproductor reproductor = new Reproductor();

    public static void main(String[] args) {
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        } while (!menu());
    }

    public static Boolean menu() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Appsound");
        System.out.println("1. reproducir canciones");
        System.out.println("2. mis playlist");
        System.out.println("3. Salir");
        // Capturar
        Scanner kb = new Scanner(System.in);
        String opcion = kb.nextLine();
        // crear
        // Gestionar opciones
        if (opcion.equals("3")) {
            return true;
        } else if (opcion.equals("1")) {
            mostrarGaleria();
        } else if (opcion.equals("2")) {
            mostrarPlaylist();
        } //ninguna
        else {
            System.out.println("Selecciona una opcion valida");
        }
        return false;
    }

    public static void mostrarGaleria() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        AtomicInteger ordinal = new AtomicInteger(1);
        reproductor.getGaleria().forEach(cancion -> {
            System.out.println("" + ordinal.toString() + ". - " + cancion.getNombre() + " | " + cancion.getArtista());
            ordinal.getAndIncrement();
        });
        System.out.println("Selecciona el numero de una cancion para reproducirla ");
        Scanner kb = new Scanner(System.in);
        String cancion = kb.nextLine();
        reproductor.play(reproductor.getGaleria().get(Integer.parseInt(cancion) - 1));
    }

    public static void mostrarPlaylist() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Selecciona una playlist ");
        AtomicInteger ordinal = new AtomicInteger(1);
        reproductor.getPlaylist().forEach(playlist -> {
            System.out.println("" + ordinal.toString() + ". -" + playlist.getNombrePlaylist());
            ordinal.getAndIncrement();
        });
        System.out.println("" + ordinal.toString() + ".Crear playlist");
        Scanner kb = new Scanner(System.in);
        int opcion = Integer.parseInt( kb.nextLine());
        if( reproductor.getPlaylist().size() == (opcion - 1)){
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Digita el nombre de la playlist");
            Scanner kbPlay = new Scanner(System.in);
            String nombrePlaylist =  kbPlay.nextLine();
            reproductor.crearPlayist(nombrePlaylist);
        } else{
            menuPlaylist(opcion);
        }
    }
    
    public static void menuPlaylist(Integer opcion){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        AtomicInteger ordinal = new AtomicInteger(1);
        PlaylistDto playlistSeleccionada = reproductor.getPlaylist().get((opcion - 1));
        playlistSeleccionada.getCanciones().forEach(cancion -> {
                System.out.println("" + ordinal.toString() + ". - " + cancion.getNombre() + " | " + cancion.getArtista());
                ordinal.getAndIncrement();
            });
        System.out.println("1. para agregar cancion");
//        System.out.println("2. para reproducir");
        System.out.println("2. Volver menu principal");
        Scanner kb = new Scanner(System.in);
        int opcionMenu = Integer.parseInt( kb.nextLine());
        if(opcionMenu == 1){
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
            int opcionAddCancion = Integer.parseInt( kb2.nextLine());
            if(opcionAddCancion-1 == filtrados.size()){
                menuPlaylist(opcion);
            }else{
                Cancion cancion = filtrados.get(opcionAddCancion-1);
                playlistSeleccionada.agregarCancion(cancion);
            }
        }
 //       else if(opcionMenu == 2){
 //           reproductor.reproducirPlay(playlistSeleccionada);
 //       }else{
//           System.out.print("\033[H\033[2J");
 //           System.out.flush();
 //       }
    }
}
