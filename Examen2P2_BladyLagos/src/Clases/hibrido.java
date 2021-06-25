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
public class hibrido {

    private String marcah;
    private String modeloh;
    private String vinh;
    private String carroceriah;
    private String kmautonomiah;
    private String cantpasajerosh;
    private String precioh;

    public hibrido() {
    }

    public hibrido(String marcah, String modeloh, String vinh, String carroceriah, String kmautonomiah, String cantpasajerosh, String precioh) {
        this.marcah = marcah;
        this.modeloh = modeloh;
        this.vinh = vinh;
        this.carroceriah = carroceriah;
        this.kmautonomiah = kmautonomiah;
        this.cantpasajerosh = cantpasajerosh;
        this.precioh = precioh;
    }

    public String getMarcah() {
        return marcah;
    }

    public void setMarcah(String marcah) {
        this.marcah = marcah;
    }

    public String getModeloh() {
        return modeloh;
    }

    public void setModeloh(String modeloh) {
        this.modeloh = modeloh;
    }

    public String getVinh() {
        return vinh;
    }

    public void setVinh(String vinh) {
        this.vinh = vinh;
    }

    public String getCarroceriah() {
        return carroceriah;
    }

    public void setCarroceriah(String carroceriah) {
        this.carroceriah = carroceriah;
    }

    public String getKmautonomiah() {
        return kmautonomiah;
    }

    public void setKmautonomiah(String kmautonomiah) {
        this.kmautonomiah = kmautonomiah;
    }

    public String getCantpasajerosh() {
        return cantpasajerosh;
    }

    public void setCantpasajerosh(String cantpasajerosh) {
        this.cantpasajerosh = cantpasajerosh;
    }

    public String getPrecioh() {
        return precioh;
    }

    public void setPrecioh(String precioh) {
        this.precioh = precioh;
    }

    @Override
    public String toString() {
        return marcah;
    }

    
}
