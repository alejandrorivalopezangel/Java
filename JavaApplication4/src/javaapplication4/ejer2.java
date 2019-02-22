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
public class ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner r=new Scanner(System.in);
        int km=0;
        double costo=10.5;
        System.out.print("ingrese los Klometros que quiere rrecorre");
        km=Integer.valueOf(r.next());
        System.out.println("precio del voleto del vueleto Bs:"+(costo*km)+"precio de cada km"+costo);
    }
    
}
