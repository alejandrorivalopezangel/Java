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
public class ejer22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner r16= new Scanner(System.in);
        double metr=0;
        double pies=3.084;
        double pulgada=2.54;
        double tota=0;
        double tot=0;
     
        System.out.print("ingrese los metros que desea conbvertir");
        metr=Double.valueOf(r16.next());
        tota=(metr*pies);
        tot=(metr*pulgada);
        System.out.println("metros en pie"+tota+ "metros en pulgada"+tot);
        
        
        
        
    }
    
}
