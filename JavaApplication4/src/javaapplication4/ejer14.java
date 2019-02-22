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
public class ejer14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner r5=new Scanner (System.in);
        int a=0;
        int b=0;
        int c=0;
        System.out.print("ingrese primer numero");
        a=Integer.valueOf(r5.next());
        System.out.print("ingrese el segundo numero");
        b=Integer.valueOf(r5.next());
        System.out.print("ingrese el tercer numero");
        c=Integer.valueOf(r5.next());
        System.out.print("x = "+a+b+c);
                
        
    }
    
}
