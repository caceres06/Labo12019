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
     ArrayList lista = null;
     CrearLista(lista);
     SumaArreglo(lista);
    }
    
    public static void CrearLista(ArrayList aux){
         for(int i=1; i<=9; i++){
                int num = (int)(Math.random()*15+1);
                aux.add(num);
         }
         System.out.println(aux);
    }
    
    public static void SumaArreglo(ArrayList a){
        for (int i=1; i>=9;i++){
            for(int j=9; j>0;i--){
               int c= (int) a.get(i);
                int d=(int) a.get(j);
            }
            int c = 0;
            int d = 0;
            int suma = c+d;
            System.out.println(suma);
    }
    }
}
//ARREGLAR EL NULL
    
   