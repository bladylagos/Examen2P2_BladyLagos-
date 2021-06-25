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
public class David4 {

    String Nombre;
    private ArrayList<electrico> lista4 = new ArrayList();

    public David4(String Nombre) {
        this.Nombre = Nombre;
    }

    public David4() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<electrico> getLista4() {
        return lista4;
    }

    public void setLista4(ArrayList<electrico> lista4) {
        this.lista4 = lista4;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    //extra mutador

    public void setElectrico(electrico p) {
        this.lista4.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        File archivo = new File("./" + getNombre() + ".txt");
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (electrico t : lista4) {
                bw.write(t.getMarcael() + "/");
                bw.write(t.getModeloel() + "/");
                bw.write(t.getVinel() + "/");
                bw.write(t.getCarroceriael() + "/");
                bw.write(t.getCoeficienteel() + "/");
                bw.write(t.getCantmotoresel() + "/");
                bw.write(t.getTiemporecargael()+ "/");
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
        lista4 = new ArrayList();
        File archivo = new File("./" + getNombre() + ".txt");
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("/");
                while (sc.hasNext()) {
                    lista4.add(new electrico(sc.next(),
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
