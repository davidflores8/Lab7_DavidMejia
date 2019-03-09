/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leotify;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Nadina Mazzoni
 */
public class Artista extends Persona{
    ArrayList<Canciones>canciones=new ArrayList();
    ArrayList<Usuario>seguidores=new ArrayList();
    ArrayList<Album>albumes=new ArrayList();
    ArrayList<Canciones>sencillos=new ArrayList();

    public Artista(String nombre, String apellido, String usuario, String contrasena, Date fecha) {
        super(nombre, apellido, usuario, contrasena, fecha);
    }

    public ArrayList<Canciones> getSencillos() {
        return sencillos;
    }

    public void setSencillos(ArrayList<Canciones> sencillos) {
        this.sencillos = sencillos;
    }

    
    public ArrayList<Canciones> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Canciones> canciones) {
        this.canciones = canciones;
    }

    public ArrayList<Usuario> getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(ArrayList<Usuario> seguidores) {
        this.seguidores = seguidores;
    }

    public ArrayList<Album> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(ArrayList<Album> albumes) {
        this.albumes = albumes;
    }

    

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
}
