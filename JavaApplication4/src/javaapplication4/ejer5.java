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
public class ejer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner r7= new Scanner (System.in);
        double precio=0;
        double descuento = 0.35;
        System.out.println("ingrese el total de medicamentos: ");
        precio=Double.valueOf(r7.next());
        System.out.println("total de mediceina a pagar es de: Bs"+(precio-(precio*descuento)));
        
    }
}
