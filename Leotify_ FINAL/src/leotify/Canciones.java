/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leotify;

import java.io.Serializable;

/**
 *
 * @author Nadina Mazzoni
 */
public class Canciones implements Serializable{
    String nombre;
    int ano;
    Artista artista;
    int duracion;

    public Canciones(String nombre, int ano, Artista artista, int duracion) {
        this.nombre = nombre;
        this.ano = ano;
        this.artista = artista;
        this.duracion = duracion;
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

    

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return nombre +" - "+artista;
    }
    
    
    
}
