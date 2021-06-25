/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author Gerardo Lagos
 */
public class David2 {

    String Nombre;
    private ArrayList<hibrido> lista2 = new ArrayList();

    public David2(String Nombre) {
        this.Nombre = Nombre;
    }

    public David2() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<hibrido> getLista2() {
        return lista2;
    }

    public void setLista2(ArrayList<hibrido> lista2) {
        this.lista2 = lista2;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    //extra mutador

    public void setHibrido(hibrido p) {
        this.lista2.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        File archivo = new File("./" + getNombre() + ".txt");
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (hibrido t : lista2) {
                bw.write(t.getMarcah() + "/");
                bw.write(t.getModeloh() + "/");
                bw.write(t.getVinh() + "/");
                bw.write(t.getCarroceriah() + "/");
                bw.write(t.getKmautonomiah() + "/");
                bw.write(t.getCantpasajerosh() + "/");
                bw.write(t.getPrecioh() + "/");
                bw.newLine();
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        lista2 = new ArrayList();
        File archivo = new File("./" + getNombre() + ".txt");
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("/");
                while (sc.hasNext()) {
                    lista2.add(new hibrido(sc.next(),
                            sc.next(), sc.next(),
                            sc.next(), sc.next(), sc.next(), sc.next()
                    )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
