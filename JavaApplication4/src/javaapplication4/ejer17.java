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
public class ejer17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner r11=new Scanner(System.in);
        double suel=0;
        double comisi=0.10;
        double ven1=0;
        double ven2=0;
        double ven3=0;
        double total=0;
        System.out.print("ingrese sueldo base");
        suel=Double.valueOf(r11.next());
        System.out.print("ingrese la primer venta");
        ven1=Double.valueOf(r11.next());
        System.out.print("ingrese la segunda venta ");
        ven2=Double.valueOf(r11.next());
        System.out.print("ingrese l tercer venta ");
        ven3=Double.valueOf(r11.next());
        total=((ven1+ven2+ven3)*comisi)+suel;
        System.out.print("sueldo total "+total);
        
                
                
    }
    
}
