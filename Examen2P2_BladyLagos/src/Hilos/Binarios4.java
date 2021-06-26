/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

import Clases.electrico;
import Clases.enchufable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Gerardo Lagos
 */
public class Binarios4 {

    private ArrayList<electrico> lista4 = new ArrayList();
    private File archivo = null;

    public Binarios4(String path) {
        archivo = new File(path);
    }

    public void setclie(electrico a) {
        lista4.add(a);
    }

    public ArrayList<electrico> getLista4() {
        return lista4;
    }

    public void setLista4(ArrayList<electrico> lista4) {
        this.lista4 = lista4;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public Binarios4() {
    }

    @Override
    public String toString() {
        return "Binarios4 = " + "lista4=" + lista4 + ", archivo=" + archivo;
    }
    
     
    public void cargarArchivo() {
        try {
            lista4 = new ArrayList();
            electrico temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (electrico) objeto.readObject()) != null) {
                        lista4.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (electrico t : lista4) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
 
}
