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
public class ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner riv= new Scanner(System.in);
        int arreglo[]= new int [5];
        for (int i=0; i<=5; i++){
            System.out.println("ingrese el numero;,");
            arreglo[1]=Integer.valueOf(riv.next());
        }
        System.out.println("valores al reves");
        for (int i=4;i>=0; i--){
            System.out.println(arreglo[i]);
        }
    }
    
}
