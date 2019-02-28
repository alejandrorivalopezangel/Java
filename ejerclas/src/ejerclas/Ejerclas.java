/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerclas;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Rivas
 */
public class Ejerclas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner riv = new Scanner (System.in);
        String[] arreglo= new String[] {"A","B","C","D","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","X","Y","Z"};
        for (int i = 0; i < 23; i++) {
            System.out.print("Ingresa un valor:.");
            arreglo[i] = String.valueOf(riv.next());    
        // TODO code application logic here
        }
         System.out.println(Arrays.toString(arreglo));
    }
    
}
