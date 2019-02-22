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
public class ejer13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner r9=new Scanner(System.in);
        int nu1=0;
        int nu2=0;
        int sum=0;
        double prome1=0;
        double prome2=0;
        System.out.print("ingrese el primer numero");
        nu1=Integer.valueOf(r9.next());
        System.out.print("ingrese el segundo numero");
        nu2=Integer.valueOf(r9.next());
         sum=(nu1+nu1)+(nu2+nu2);
         prome1=(nu1*nu1*nu1)/3;
         prome2=(nu2*nu2*nu2)/3;
         System.out.println("la suma del primer numero por el segundo "+sum);
         System.out.println("promedio del primer numero"+prome1);
         System.out.println("promedio del segundo numero"+prome2);
        
    }
    
}
