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
public class ejer18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner r12=new Scanner(System.in);
        double compra=0;
        double des=0.10;
        double total=0;
        System.out.print("ingrese el precio de la compr");
        compra=Double.valueOf(r12.next());
        total=compra-(compra*des);
        System.out.print("total de compra menos descuento"+total);
        
    }
    
}
