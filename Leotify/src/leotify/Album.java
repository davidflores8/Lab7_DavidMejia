/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leotify;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Nadina Mazzoni
 */
public class Album implements Serializable{
    String nombre;
    int ano;
    Artista artista;
    ArrayList<Canciones>canciones=new ArrayList();

    public Album(String nombre, int ano, Artista artista) {
        this.nombre = nombre;
        this.ano = ano;
        this.artista = artista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    

    public ArrayList<Canciones> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Canciones> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
    
}
