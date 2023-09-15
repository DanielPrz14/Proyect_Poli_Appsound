
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
    //la clase reproductor tiene que tener 3 metodos
    private ArrayList<Cancion> galeria = Precarga.initBodegaCanciones();
    private ArrayList<PlaylistDto> playlist = new ArrayList<>();
       
    public void play(Cancion cancion){
        try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + cancion.getUrl());
        } catch (IOException ex) {
            Logger.getLogger(Reproductor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Cancion> getGaleria() {
        return galeria;
    }

    public ArrayList<PlaylistDto> getPlaylist() {
        return playlist;
    }
    
  //  public void reproducirPlay(PlaylistDto playlist){
    //    reproducirCancion(playlist, 0);
    //}
    
//    private void reproducirCancion(PlaylistDto playlist , Integer index){
  //      play( playlist.getCanciones().get(index) );
    //    new Timer().schedule(new TimerTask() {
      //      @Override
        //    public void run() {
          //      if (playlist.getCanciones().size() < (index+1)){
            //        reproducirCancion(playlist, (index+1));
              //  }
            //}
        //},( playlist.getCanciones().get(index).getDuracion() * 1000 ));
    //}
    
    public ArrayList<Cancion> filtradoPlay(ArrayList<Cancion> playListExistentes){
        ArrayList<Cancion> filtradoGaleria = new ArrayList<>();
        galeria.forEach( cancion -> {
            if( !playListExistentes.contains(cancion) ){
                filtradoGaleria.add(cancion);
            }
        });
        return filtradoGaleria;
    }
    
    public void crearPlayist(String nombre){
        playlist.add( new PlaylistDto(nombre) );
    }
}
