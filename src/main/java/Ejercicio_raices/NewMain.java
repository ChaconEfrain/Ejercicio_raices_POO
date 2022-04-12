/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_raices;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el valor de 'a':");
        double a = lector.nextDouble();
        System.out.println("Ingrese el valor de 'b':");
        double b = lector.nextDouble();
        System.out.println("Ingrese el valor de 'c':");
        double c = lector.nextDouble();
        
        Raices ecuacion = new Raices(a, b, c);
        ecuacion.calcular();
    }
    
}
