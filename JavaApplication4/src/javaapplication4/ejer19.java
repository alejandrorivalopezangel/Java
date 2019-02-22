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
public class ejer19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner r13=new Scanner (System.in);
        double exa1=0;
        double exa2=0;
        double exa3=0;
        double totalex=0;
        System.out.print("ingrese la primer nota del examen ");
        exa1=Double.valueOf(r13.next());
        System.out.print("ingrese la segunda nota del examen ");
        exa2=Double.valueOf(r13.next());
        System.out.print("ingrese la tercer nota");
        exa3=Double.valueOf(r13.next());
        totalex=(exa1+exa2+exa3)/3;
        System.out.print("promedio de los parciales"+totalex);
        
    }
    
}
