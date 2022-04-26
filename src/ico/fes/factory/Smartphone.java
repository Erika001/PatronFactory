/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.factory;

/**
 *
 * @author Monse
 */
public class Smartphone implements Dispositivo{
    private String marca;
    private String color;
    private boolean memoriaSD;
    private boolean sensorDeHuella;

    public Smartphone() {
    }

    public Smartphone(String marca, String color, boolean memoriaSD, boolean sensorDeHuella) {
        this.marca = marca;
        this.color = color;
        this.memoriaSD = memoriaSD;
        this.sensorDeHuella = sensorDeHuella;
    }

    public boolean isSensorDeHuella() {
        return sensorDeHuella;
    }

    public void setSensorDeHuella(boolean sensorDeHuella) {
        this.sensorDeHuella = sensorDeHuella;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isMemoriaSD() {
        return memoriaSD;
    }

    public void setMemoriaSD(boolean memoriaSD) {
        this.memoriaSD = memoriaSD;
    }

    @Override
    public String toString() {
        return "Smartphone{" + "Marca = " + marca + ", Color = " + color + ", MemoriaSD = " + memoriaSD + ", SensorDeHuella = " + sensorDeHuella + '}';
    }
    
    
}
