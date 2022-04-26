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
public class DispositivosFactory {
    public static Dispositivo createDispositivo( int tipo){
        switch(tipo){
            case Dispositivo.COMPUTADORA:
                return new Computadora("HP", "Silver", true, true);
                
            case Dispositivo.SMARTPHONE:
                return new Smartphone("Samsung", "Violeta", false, true);
                
            case Dispositivo.TABLET:
                return new Tablet("Huawei", "Azul", true, true);
                
            default:
                throw new AssertionError();
        }
    }  
}
