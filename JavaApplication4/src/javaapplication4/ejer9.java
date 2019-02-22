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
public class ejer9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner r2=new Scanner (System.in);
        int hort=0;
        int hore=0;
        double costh=0;
        double tot_hort=0;
        double tot_hore=0;
        System.out.print("ingrese las horas gtrabajadas");
        hort=Integer.valueOf(r2.next());
        System.out.print("ingrese las horas extra");
        hore=Integer.valueOf(r2.next());
        System.out.print("ingrese el costo de las horas lavoradas ");
        costh=Double.valueOf(r2.next());
        tot_hort=costh*hort;
        tot_hore=costh*hort;
        System.out.println("valor de las horas lavoradas: "+tot_hort+tot_hore);
        
        
        
        
    }
    
}
