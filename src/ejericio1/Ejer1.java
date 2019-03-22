/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejericio1;


import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Dismaelectric
 */
public class Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ArrayList numAleatorio = new ArrayList();
         System.out.println("Ingrese la longitud del arreglo");
         Scanner longi = new Scanner(System.in);
         int aux = longi.nextInt();
         for(int i=1; i<= aux; i++){
                int num = (int)(Math.random()*15+1);
                numAleatorio.add(num);
         }
         System.out.println(numAleatorio);
    }
    
}

    
   