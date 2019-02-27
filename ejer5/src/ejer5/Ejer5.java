/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Rivas
 */
public class Ejer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner num =new Scanner (System.in);
        int[] val= new int [5];
        for (int i = 0; i <5 ; i++){
            System.out.println("ingrese un numero:. ");
            val[i]=Integer.parseInt(num.next());
        
        // TODO code application logic here
                    }
        System.out.println(Arrays.toString(val));
    }
        
    
}
