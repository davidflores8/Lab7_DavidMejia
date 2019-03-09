package leotify;


import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nadina Mazzoni
 */
public class Usuario extends Persona{
    ArrayList<Canciones>canciones=new ArrayList();
    ArrayList<Playlist>playlist=new ArrayList();
    ArrayList<Artista>artistas=new ArrayList();

    public Usuario(String nombre, String apellido, String usuario, String contrasena, Date fecha) {
        super(nombre, apellido, usuario, contrasena, fecha);
    }

    public ArrayList<Canciones> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Canciones> canciones) {
        this.canciones = canciones;
    }

    public ArrayList<Playlist> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ArrayList<Playlist> playlist) {
        this.playlist = playlist;
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(ArrayList<Artista> artistas) {
        this.artistas = artistas;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
    
    
}
