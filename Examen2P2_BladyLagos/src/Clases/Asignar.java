/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Gerardo Lagos
 */
public class Asignar {

    private hibrido unhibrido;
    private baterias unbaterias;

    public Asignar(hibrido unhibrido, baterias unbaterias) {
        this.unhibrido = unhibrido;
        this.unbaterias = unbaterias;
    }

    public hibrido getUnhibrido() {
        return unhibrido;
    }

    public void setUnhibrido(hibrido unhibrido) {
        this.unhibrido = unhibrido;
    }

    public baterias getUnbaterias() {
        return unbaterias;
    }

    public void setUnbaterias(baterias unbaterias) {
        this.unbaterias = unbaterias;
    }

    @Override
    public String toString() {
        return "Asignar = " + "unhibrido=" + unhibrido + ", unbaterias=" + unbaterias;
    }
    
    
}
