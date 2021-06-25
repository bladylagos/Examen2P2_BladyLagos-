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
public class combustion {

    private String marca;
    private String modelo;
    private String vin;//(Vehicle Identification Number)
    private String carroceria;//(familiar, SUV, compacto, subcompacto o deportivo)
    private String cilindrada;//del motor (en litros)
    private String cantcilindros;//(entre 3 y 8)
    private String consumo;//(litros/kilómetros)

    public combustion() {
    }

    public combustion(String marca, String modelo, String vin, String carroceria, String cilindrada, String cantcilindros, String consumo) {
        this.marca = marca;
        this.modelo = modelo;
        this.vin = vin;
        this.carroceria = carroceria;
        this.cilindrada = cilindrada;
        this.cantcilindros = cantcilindros;
        this.consumo = consumo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getCantcilindros() {
        return cantcilindros;
    }

    public void setCantcilindros(String cantcilindros) {
        this.cantcilindros = cantcilindros;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

//    @Override
//    public String toString() {
//        return marca;
//    }

    @Override
    public String toString() {
        return "Combustion = " + "marca=" + marca + ", modelo=" + modelo + ", vin=" + vin + ", carroceria=" + carroceria + ", cilindrada=" + cilindrada + ", cantcilindros=" + cantcilindros + ", consumo=" + consumo;
    }

    
    
}
