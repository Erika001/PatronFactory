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
public class Computadora implements Dispositivo{
    private String marca; 
    private String color;
    private boolean laptop;
    private boolean bluetooth;

    public Computadora() {
    }

    public Computadora(String marca, String color, boolean laptop, boolean bluetooth) {
        this.marca = marca;
        this.color = color;
        this.laptop = laptop;
        this.bluetooth = bluetooth;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
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

    public boolean isLaptop() {
        return laptop;
    }

    public void setLaptop(boolean laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Computadora{" + "Marca = " + marca + ", Color = " + color + ", Laptop = " + laptop + ", Bluetooth = " + bluetooth + '}';
    }
    
    
}
