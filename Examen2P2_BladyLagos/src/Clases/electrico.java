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
public class electrico {

    private String marcael;
    private String modeloel;
    private String vinel;
    private String carroceriael;
    private String coeficienteel;//aerodinámico
    private String cantmotoresel;
    private String tiemporecargael;//(en horas)

    public electrico() {
    }

    public electrico(String marcael, String modeloel, String vinel, String carroceriael, String coeficienteel, String cantmotoresel, String tiemporecargael) {
        this.marcael = marcael;
        this.modeloel = modeloel;
        this.vinel = vinel;
        this.carroceriael = carroceriael;
        this.coeficienteel = coeficienteel;
        this.cantmotoresel = cantmotoresel;
        this.tiemporecargael = tiemporecargael;
    }

    public String getMarcael() {
        return marcael;
    }

    public void setMarcael(String marcael) {
        this.marcael = marcael;
    }

    public String getModeloel() {
        return modeloel;
    }

    public void setModeloel(String modeloel) {
        this.modeloel = modeloel;
    }

    public String getVinel() {
        return vinel;
    }

    public void setVinel(String vinel) {
        this.vinel = vinel;
    }

    public String getCarroceriael() {
        return carroceriael;
    }

    public void setCarroceriael(String carroceriael) {
        this.carroceriael = carroceriael;
    }

    public String getCoeficienteel() {
        return coeficienteel;
    }

    public void setCoeficienteel(String coeficienteel) {
        this.coeficienteel = coeficienteel;
    }

    public String getCantmotoresel() {
        return cantmotoresel;
    }

    public void setCantmotoresel(String cantmotoresel) {
        this.cantmotoresel = cantmotoresel;
    }

    public String getTiemporecargael() {
        return tiemporecargael;
    }

    public void setTiemporecargael(String tiemporecargael) {
        this.tiemporecargael = tiemporecargael;
    }

//    @Override
//    public String toString() {
//        return marcael;
//    }

    @Override
    public String toString() {
        return "Electrico = " + "marcael=" + marcael + ", modeloel=" + modeloel + ", vinel=" + vinel + ", carroceriael=" + carroceriael + ", coeficienteel=" + coeficienteel + ", cantmotoresel=" + cantmotoresel + ", tiemporecargael=" + tiemporecargael;
    }

    
    
    
}
