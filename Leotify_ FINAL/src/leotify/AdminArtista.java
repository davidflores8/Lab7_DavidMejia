/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leotify;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Nadina Mazzoni
 */
public class AdminArtista {
    ArrayList<Artista>artistas=new ArrayList();
    File archivo=null;

    public AdminArtista(String path) {
        archivo=new File(path);
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(ArrayList<Artista> artistas) {
        this.artistas = artistas;
    }
    
    public void setArtistas(Artista p) {
       artistas.add(p);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
          public void cargarArchivo()
    {
        try
        {
            artistas=new ArrayList();
            Artista temp;
            if (archivo.exists())
            {
                
             FileInputStream entrada=new FileInputStream(archivo);
                ObjectInputStream objeto=new ObjectInputStream(entrada);
                try
                {
                    while((temp=(Artista)objeto.readObject())!=null)
                    {
                        artistas.add(temp);
                    }
                }
                catch(EOFException e) //encontro el final del archivo
                {
                    
                }
                objeto.close();
                entrada.close();
            }
        }
        catch(Exception ex)
        {
           ex.printStackTrace();
        }
    }
    
      public void escribirArchivo() throws FileNotFoundException, IOException
    {
        FileOutputStream fw=null;
        ObjectOutputStream bw=null;
        try
        {
            fw=new FileOutputStream(archivo);
            bw=new ObjectOutputStream(fw);
            for (Artista t: artistas)
            {
                bw.writeObject(t);
            }
            bw.flush();
        }
        catch(Exception ex)
        {
            
        }
        finally
        {
            try
            {
                bw.close();
                fw.close();
            }
            catch(Exception ex)
            {
                
            }
        }
    }
    
    
    
}
