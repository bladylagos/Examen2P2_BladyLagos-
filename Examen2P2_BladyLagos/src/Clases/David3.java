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
public class David3 {

    String Nombre;
    private ArrayList<enchufable> lista3 = new ArrayList();

    public David3(String Nombre) {
        this.Nombre = Nombre;
    }

    public David3() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<enchufable> getLista3() {
        return lista3;
    }

    public void setLista3(ArrayList<enchufable> lista3) {
        this.lista3 = lista3;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    //extra mutador

    public void setEnchufable(enchufable p) {
        this.lista3.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        File archivo = new File("./" + getNombre() + ".txt");
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (enchufable t : lista3) {
                bw.write(t.getMarcae() + "/");
                bw.write(t.getModeloe() + "/");
                bw.write(t.getVine() + "/");
                bw.write(t.getCarroceriae() + "/");
                bw.write(t.getMaleteros3() + "/");
                bw.write(t.getCantgalones() + "/");
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
        lista3 = new ArrayList();
        File archivo = new File("./" + getNombre() + ".txt");
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("/");
                while (sc.hasNext()) {
                    lista3.add(new enchufable(sc.next(),
                            sc.next(), sc.next(),
                            sc.next(), sc.next(), sc.next()
                    )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }

}
