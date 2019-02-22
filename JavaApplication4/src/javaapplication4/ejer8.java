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
public class ejer8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner r10 =new Scanner(System.in);
        int mod=0;
        int mod1=0;
        int mod2=0;
        int mod3=0;
        int mod4=0;
        int mod5=0;
        
        System.out.print("ingrese monedas de 5 Bs");
        mod=Integer.valueOf(r10.next());
        System.out.print("ingrese monedas de 10 Bs");
        mod1=Integer.valueOf(r10.next());
        System.out.print("ingrese monedas de 12.5 Bs");
        mod2=Integer.valueOf(r10.next());
        System.out.print("ingrese monedas de 25 Bs");
        mod3=Integer.valueOf(r10.next());
        System.out.print("ingrese monedas de 50 Bs");
        mod4=Integer.valueOf(r10.next());
        System.out.print("ingrese monedas de 1 Bs");
        mod5=Integer.valueOf(r10.next());
       
        
        System.out.print("el total de de Bs son:. "+((mod*0.05)+(mod1*0.10)+(mod2*0.125)+(mod3*20)+(mod4*50)+(mod5*1)));
        
        
    }
    
}
