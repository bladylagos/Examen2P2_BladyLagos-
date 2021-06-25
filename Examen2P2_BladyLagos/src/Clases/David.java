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
public class David {

    String Nombre;
    private ArrayList<combustion> lista = new ArrayList();

    public David(String Nombre) {
        this.Nombre = Nombre;
    }

    public David() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<combustion> getLista() {
        return lista;
    }

    public void setLista(ArrayList<combustion> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    //extra mutador

    public void setCombustion(combustion p) {
        this.lista.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        File archivo = new File("./" + getNombre() + ".txt");
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (combustion t : lista) {
                bw.write(t.getMarca() + "/");
                bw.write(t.getModelo() + "/");
                bw.write(t.getVin() + "/");
                bw.write(t.getCarroceria() + "/");
                bw.write(t.getCilindrada() + "/");
                bw.write(t.getCantcilindros() + "/");
                bw.write(t.getConsumo() + "/");
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
        lista = new ArrayList();
        File archivo = new File("./" + getNombre() + ".txt");
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("/");
                while (sc.hasNext()) {
                    lista.add(new combustion(sc.next(),
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
