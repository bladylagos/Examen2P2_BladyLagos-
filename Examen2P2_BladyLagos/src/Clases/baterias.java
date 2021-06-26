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
public class baterias {

    private String marcab;//de fabricación 
    private String capacidadb;// capacidad que tiene
    private String autonomiab;//autonomía que ofrece
    private String modulosb;//
    private String cargab;//capacidad
    private String paraQueVehiculob;//(hibrido, hibrido enchufable o eléctrico puro)
    private String tiempob;

    public baterias() {
    }

    public baterias(String marcab, String capacidadb, String autonomiab, String modulosb, String cargab, String paraQueVehiculob, String tiempob) {
        this.marcab = marcab;
        this.capacidadb = capacidadb;
        this.autonomiab = autonomiab;
        this.modulosb = modulosb;
        this.cargab = cargab;
        this.paraQueVehiculob = paraQueVehiculob;
        this.tiempob = tiempob;
    }

    public String getMarcab() {
        return marcab;
    }

    public void setMarcab(String marcab) {
        this.marcab = marcab;
    }

    public String getCapacidadb() {
        return capacidadb;
    }

    public void setCapacidadb(String capacidadb) {
        this.capacidadb = capacidadb;
    }

    public String getAutonomiab() {
        return autonomiab;
    }

    public void setAutonomiab(String autonomiab) {
        this.autonomiab = autonomiab;
    }

    public String getModulosb() {
        return modulosb;
    }

    public void setModulosb(String modulosb) {
        this.modulosb = modulosb;
    }

    public String getCargab() {
        return cargab;
    }

    public void setCargab(String cargab) {
        this.cargab = cargab;
    }

    public String getParaQueVehiculob() {
        return paraQueVehiculob;
    }

    public void setParaQueVehiculob(String paraQueVehiculob) {
        this.paraQueVehiculob = paraQueVehiculob;
    }

    public String getTiempob() {
        return tiempob;
    }

    public void setTiempob(String tiempob) {
        this.tiempob = tiempob;
    }

    @Override
    public String toString() {
        return "Baterias = " + "marcab=" + marcab + ", capacidadb=" + capacidadb + ", autonomiab=" + autonomiab + ", modulosb=" + modulosb + ", cargab=" + cargab + ", paraQueVehiculob=" + paraQueVehiculob + ", tiempob=" + tiempob;
    }

    
}
