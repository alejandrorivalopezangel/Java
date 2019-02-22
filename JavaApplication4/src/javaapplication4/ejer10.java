/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author Rivas
 */
public class ejer10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner r3=new Scanner(System.in);
        double arena=0.05;
        double reann=0;
        double ar=0;
        double b=0;
        double h=0;
        System.out.print("ingrese el largo de la pared");
        b=Double.valueOf(r3.next());
        System.out.print("ingrese la altura");
        h=Double.valueOf(r3.next());
        ar=b*h;
        reann=ar*arena;
        System.out.print("metros cubicos para la pared: "+reann);
       
        
        
        
        
    }
    
}
