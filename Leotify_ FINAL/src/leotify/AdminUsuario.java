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
public class AdminUsuario {
    ArrayList<Usuario>usuario =new ArrayList();
    File archivo=null;

    public AdminUsuario(String path) {
        archivo=new File(path);
    }

    public ArrayList<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(ArrayList<Usuario> usuario) {
        this.usuario = usuario;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
     public void setUsuario(Usuario p) {
        usuario.add(p);
    }
     
      public void cargarArchivo()
    {
        try
        {
            usuario=new ArrayList();
            Usuario temp;
            if (archivo.exists())
            {
                
             FileInputStream entrada=new FileInputStream(archivo);
                ObjectInputStream objeto=new ObjectInputStream(entrada);
                try
                {
                    while((temp=(Usuario)objeto.readObject())!=null)
                    {
                        usuario.add(temp);
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
            for (Usuario t: usuario)
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
