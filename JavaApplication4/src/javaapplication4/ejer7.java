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
public class ejer7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner r9=new Scanner(System.in);
        double pediatria=0;
        double urgencia=0;
        double traumatologia=0;
        double presup=0;
        System.out.print("ingrese presupuesto anuel");
        presup=Double.valueOf(r9.next());
        pediatria=presup*0.42;
        urgencia=presup*0.37;
        traumatologia=presup*0.21;
        System.out.println("presupuesto para el area de pediatria:. "+pediatria);
        System.out.println("presupuesto para el area de urgencia.. "+urgencia);
        System.out.println("presupuesto para el area de traumatologia:. "+traumatologia);
        
    }
    
}
