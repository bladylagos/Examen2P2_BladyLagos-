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

/**
 *
 * @author Gerardo Lagos
 */
public class David5 {

    String Nombre;
    private ArrayList<baterias> lista5 = new ArrayList();

    public David5(String Nombre) {
        this.Nombre = Nombre;
    }

    public David5() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<baterias> getLista5() {
        return lista5;
    }

    public void setLista5(ArrayList<baterias> lista5) {
        this.lista5 = lista5;
    }
    
        @Override
    public String toString() {
        return Nombre;
    }
    //extra mutador

    public void setBaterias(baterias p) {
        this.lista5.add(p);
    }
    
        //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        File archivo = new File("./" + getNombre() + ".txt");
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (baterias t : lista5) {
                bw.write(t.getMarcab() + "/");
                bw.write(t.getCapacidadb() + "/");
                bw.write(t.getAutonomiab()+ "/");
                bw.write(t.getModulosb() + "/");
                bw.write(t.getCargab() + "/");
                bw.write(t.getParaQueVehiculob() + "/");
                bw.write(t.getTiempob() + "/");
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
        lista5 = new ArrayList();
        File archivo = new File("./" + getNombre() + ".txt");
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("/");
                while (sc.hasNext()) {
                    lista5.add(new baterias(sc.next(),
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
