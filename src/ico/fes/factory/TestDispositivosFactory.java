/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.factory;

import java.util.Scanner;

/**
 *
 * @author Monse
 */
public class TestDispositivosFactory {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int eleccion = 0; 
        
        System.out.println(Dispositivo.COMPUTADORA + ") Computadora");
        System.out.println(Dispositivo.SMARTPHONE + ") Smartphone");
        System.out.println(Dispositivo.TABLET + ") Tablet"); 
        
        try {
            System.out.print("Escoga un número: ");
            eleccion = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("No capturo un número");
        }
        
        Dispositivo electronicos = DispositivosFactory.createDispositivo(eleccion);
        System.out.println(electronicos.toString());
    }
}
