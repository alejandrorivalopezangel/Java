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
public class ejer20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner r14=new Scanner(System.in);
        int hom=0;
        int muj=0;
        int tot=0;
        System.out.print("ingrese la cantidad de hombres");
        hom=Integer.valueOf(r14.next());
        System.out.print("ingrese cantidad de mujeres");
        muj=Integer.valueOf(r14.next());
        tot= hom+muj;
        System.out.print("la cantidad de hombres  es de "+((hom*100)/14));
        System.out.print("la cantidad de mujeres es de"+((muj*100)/14));
        
        
        
    }
    
}
