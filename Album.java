package com.mycompany.dto;

import java.util.ArrayList;

public class Album {
    // Una clase que representa un álbum de canciones.

    // ArrayList para almacenar las canciones en el álbum.
    private ArrayList<Cancion> canciones;
    
    // Año de salida del álbum.
    private Integer fechaSalida;
    
    // Nombre del álbum.
    private String nombreAlbum;

    // Constructor que recibe canciones y la fecha de salida del álbum.
    public Album(ArrayList<Cancion> canciones, Integer fechaSalida) {
        // Inicializa los campos con los valores proporcionados.
        this.canciones = canciones;
        this.fechaSalida = fechaSalida;
        this.nombreAlbum = nombreAlbum; // NOTA: Falta la asignación del nombre del álbum aquí.
    }

    // Constructor sin argumentos.
    public Album() {
        // Se utiliza cuando no se proporcionan canciones ni fecha de salida.
    }

    // Método para obtener la lista de canciones del álbum.
    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    // Método para obtener la fecha de salida del álbum.
    public Integer getFechaSalida() {
        return fechaSalida;
    }

    // Método para obtener el nombre del álbum.
    public String getNombreAlbum() {
        return nombreAlbum;
    }

    // Método para establecer la lista de canciones del álbum.
    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    // Método para establecer la fecha de salida del álbum.
    public void setFechaSalida(Integer fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    // Método para establecer el nombre del álbum.
    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }
    
    // Método para calcular la duración total del álbum (suma de las duraciones de las canciones).
    public Integer getDuracion(){
        Integer duracion = 0;
        for (int index = 0; index < canciones.size(); index++){
             duracion += canciones.get(index).getDuracion();
        }        
        return duracion;
    }
}

