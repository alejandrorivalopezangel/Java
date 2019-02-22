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
public class ejer16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner r8=new Scanner(System.in);
        int capital=0;
        double descuento=0.025;
        double total=0;
        System.out.print("ingrese el capital");
        capital=Integer.valueOf(r8.next());
        total=(capital*descuento)*12;
        System.out.print("el dinero ganado despues de un año"+total);
        
    }
    
}
