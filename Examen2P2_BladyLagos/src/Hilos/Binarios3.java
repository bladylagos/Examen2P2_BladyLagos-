/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

import Clases.enchufable;
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
public class Binarios3 {

    private ArrayList<enchufable> lista3 = new ArrayList();
    private File archivo = null;

    public Binarios3(String path) {
        archivo = new File(path);
    }

    public void setclie(enchufable a) {
        lista3.add(a);
    }

    public ArrayList<enchufable> getLista3() {
        return lista3;
    }

    public void setLista3(ArrayList<enchufable> lista3) {
        this.lista3 = lista3;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public Binarios3() {
    }

    @Override
    public String toString() {
        return "Binarios = " + "lista3=" + lista3 + ", archivo=" + archivo;
    }
    
    
    public void cargarArchivo() {
        try {
            lista3 = new ArrayList();
            enchufable temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (enchufable) objeto.readObject()) != null) {
                        lista3.add(temp);
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
            for (enchufable t : lista3) {
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
