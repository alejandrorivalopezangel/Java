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
public class ejer21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner r15=new Scanner(System.in);
        double salario=0;
        double aumento=0.25;
        double aumen=0;
        System.out.print("ingresar el asalario del obrero");
        salario=Double.valueOf(r15.next());
        aumen=(salario*aumento)+salario;
        System.out.print("el aumento del salario es de "+ aumen);
        
        
    }
    
}
