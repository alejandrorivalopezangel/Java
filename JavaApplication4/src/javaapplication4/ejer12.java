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
public class ejer12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner r1=new Scanner(System.in);
        double descuento=0.20;
        double salario=0;
        System.out.print("ingrese salario del empleado");
        salario=Double.valueOf(r1.next());
        System.out.print("total salario menos descuento: "+(salario-(salario*descuento)));
    }
    
}
