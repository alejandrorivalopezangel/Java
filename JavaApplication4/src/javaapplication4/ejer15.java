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
public class ejer15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner r7=new Scanner (System.in);
        int meses=0;
        int año=0;
        int totalmes=0;
        System.out.print("ingrese los meses ");
        meses=Integer.valueOf(r7.next());
        System.out.print("ingrese los años");
        año=Integer.valueOf(r7.next());
        totalmes=(año*12)+meses;
        System.out.print("los meses en total "+totalmes);
        
        
    }
    
}
