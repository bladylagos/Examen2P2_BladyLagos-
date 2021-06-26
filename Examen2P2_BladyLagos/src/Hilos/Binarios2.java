/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

import Clases.combustion;
import Clases.hibrido;
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
public class Binarios2 {

    private ArrayList<hibrido> lista2 = new ArrayList();
    private File archivo = null;

    public Binarios2(String path) {
        archivo = new File(path);
    }

    public void setclie(hibrido a) {
        lista2.add(a);
    }

    public ArrayList<hibrido> getLista2() {
        return lista2;
    }

    public void setLista2(ArrayList<hibrido> lista2) {
        this.lista2 = lista2;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public Binarios2() {
    }

    @Override
    public String toString() {
        return "Binarios2 = " + "lista2=" + lista2 + ", archivo=" + archivo;
    }

    public void cargarArchivo() {
        try {
            lista2 = new ArrayList();
            hibrido temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (hibrido) objeto.readObject()) != null) {
                        lista2.add(temp);
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
            for (hibrido t : lista2) {
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
