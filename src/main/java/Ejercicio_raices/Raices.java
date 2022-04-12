/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_raices;

/**
 *
 * @author Dell
 */
public class Raices {
    //Atributos
    private double a;
    private double b;
    private double c;
    
    //Constructores
    public Raices(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //Métodos
    public double getDiscriminante(){
        return Math.pow(b, 2) - 4*a*c;
    }
    private boolean tieneRaiz(){
        return getDiscriminante() == 0;
    }
    private boolean tieneRaices(){
        return getDiscriminante() >= 0;
    }
    private void obtenerRaices(){
        double x1 = (-b + Math.sqrt(((Math.pow(b, 2)) - 4*a*c)))/ (2*a);
        System.out.println("La solución para x1 es: " + x1);
        double x2 = (-b - Math.sqrt(((Math.pow(b, 2)) - 4*a*c)))/ (2*a);
        System.out.println("La solución para x2 es: " + x2);
    }
    private void obtenerRaiz(){
        double x = -b / (2*a);
        System.out.println("La única solución es: " + x);
    }
    public void calcular(){
        if(tieneRaiz()){
            obtenerRaiz();
        }else if(tieneRaices()){
            obtenerRaices();
        }else{
            System.out.println("No tiene solución.");
        }
    }
}
