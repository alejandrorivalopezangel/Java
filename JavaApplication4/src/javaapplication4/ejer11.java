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
public class ejer11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner r4=new Scanner(System.in);
        int hor=0;
        int segh=3600;
        int min=0;
        int cseg=0;
        double vals=0.25;
        double total=0;
        System.out.print("ingrese cantidad de horas");
        hor=Integer.valueOf(r4.next());
        System.out.print("ingrese la cantidad de minutos");
        min=Integer.valueOf(r4.next());
        System.out.print("ingrese segundos ");
        cseg=Integer.valueOf(r4.next());
        total=(hor*cseg)+(min+cseg)+cseg;
        
        System.out.print("costo total"+total*vals);
        
        
        
    }
    
}
