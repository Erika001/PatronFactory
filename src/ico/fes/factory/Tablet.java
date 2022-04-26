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
public class Tablet implements Dispositivo{
    private String marca;
    private String color;
    private boolean camaraFrontal;
    private boolean pantallaFullHD;

    public Tablet() {
    }

    public Tablet(String marca, String color, boolean camaraFrontal, boolean pantallaFullHD) {
        this.marca = marca;
        this.color = color;
        this.camaraFrontal = camaraFrontal;
        this.pantallaFullHD = pantallaFullHD;
    }

    public boolean isPantallaFullHD() {
        return pantallaFullHD;
    }

    public void setPantallaFullHD(boolean pantallaFullHD) {
        this.pantallaFullHD = pantallaFullHD;
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

    public boolean isCamaraFrontal() {
        return camaraFrontal;
    }

    public void setCamaraFrontal(boolean camaraFrontal) {
        this.camaraFrontal = camaraFrontal;
    }

    @Override
    public String toString() {
        return "Tablet{" + "Marca = " + marca + ", Color = " + color + ", CamaraFrontal = " + camaraFrontal + ", PantallaFullHD = " + pantallaFullHD + '}';
    }
    
    
}
