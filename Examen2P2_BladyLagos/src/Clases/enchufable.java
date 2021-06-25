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
public class enchufable {

    private String marcae;
    private String modeloe;
    private String vine;
    private String carroceriae;
    private String maleteros3;//capacidad
    private String cantgalones;//combustible

    public enchufable() {
    }

    public enchufable(String marcae, String modeloe, String vine, String carroceriae, String maleteros3, String cantgalones) {
        this.marcae = marcae;
        this.modeloe = modeloe;
        this.vine = vine;
        this.carroceriae = carroceriae;
        this.maleteros3 = maleteros3;
        this.cantgalones = cantgalones;
    }

    public String getMarcae() {
        return marcae;
    }

    public void setMarcae(String marcae) {
        this.marcae = marcae;
    }

    public String getModeloe() {
        return modeloe;
    }

    public void setModeloe(String modeloe) {
        this.modeloe = modeloe;
    }

    public String getVine() {
        return vine;
    }

    public void setVine(String vine) {
        this.vine = vine;
    }

    public String getCarroceriae() {
        return carroceriae;
    }

    public void setCarroceriae(String carroceriae) {
        this.carroceriae = carroceriae;
    }

    public String getMaleteros3() {
        return maleteros3;
    }

    public void setMaleteros3(String maleteros3) {
        this.maleteros3 = maleteros3;
    }

    public String getCantgalones() {
        return cantgalones;
    }

    public void setCantgalones(String cantgalones) {
        this.cantgalones = cantgalones;
    }

    @Override
    public String toString() {
        return marcae;
    }

    

    
    
}
