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
public class ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner rivas = new Scanner(System.in);
        double costo = 1.5;
        double total =0;
        double descuento = 0;
        int hora = 0;
        System.out.println("ingrese la cantidad de horas que necesite: ");
        hora=Integer.valueOf(rivas.next());
        if (hora > 0  && hora < 5){
            System.out.print("total por pagar: Bs"+(hora*costo)+"no hay descuento");
        }
        else{
            descuento = hora/5*costo;
            total=hora*costo-descuento;
            System.out.print("total a pagar: Bs"+total+"se desconto una hora ");
        }
    }
    
}
