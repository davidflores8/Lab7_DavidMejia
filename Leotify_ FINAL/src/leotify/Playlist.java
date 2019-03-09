/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leotify;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Nadina Mazzoni
 */
public class Playlist implements Serializable{
    String nombre;
    String genero;
    Date fecha;
    ArrayList<Canciones>canciones=new ArrayList();
    int duracion;

    public Playlist(String nombre, String genero, Date fecha) {
        this.nombre = nombre;
        this.genero = genero;
        this.fecha = fecha;
    }

    
    public Playlist(String nombre, String genero, Date fecha, int duracion) {
        this.nombre = nombre;
        this.genero = genero;
        this.fecha = fecha;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Canciones> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Canciones> canciones) {
        this.canciones = canciones;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
}
