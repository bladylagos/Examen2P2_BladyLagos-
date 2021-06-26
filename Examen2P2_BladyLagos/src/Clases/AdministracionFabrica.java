/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Gerardo Lagos
 */
public class AdministracionFabrica {

    public static ArrayList<combustion> listacombustion = new ArrayList<>();
    public static ArrayList<hibrido> listahibrido = new ArrayList<>();
    public static ArrayList<enchufable> listaenchufable = new ArrayList<>();
    public static ArrayList<electrico> listaelectrico = new ArrayList<>();
    public static ArrayList<baterias> listabaterias = new ArrayList<>();

    public static void agregarcombustion(combustion uncombustion) {
        listacombustion.add(uncombustion);
    }

    public static void agregarhibrido(hibrido unhibrido) {
        listahibrido.add(unhibrido);
    }

    public static void agregarenchufable(enchufable unenchufable) {
        listaenchufable.add(unenchufable);
    }

    public static void agregarelectrico(electrico unaelectrico) {
        listaelectrico.add(unaelectrico);
    }

    public static void agregarbaterias(baterias unabaterias) {
        listabaterias.add(unabaterias);
    }

}
