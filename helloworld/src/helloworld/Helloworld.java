/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.Scanner;

/**
 *
 * @author Maria Teresa
 */
public class Helloworld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduzca el valor de x:");
        int x = sc.nextInt();
        System.out.println("Introduzca ell valor de Y:");
        int y = sc.nextInt();
                 
        int suma= x+y;
        int resta= x-y;
       float  division = (float)x/(float)y;
        int producto = x*y;
     System.out.println("La suma es : " + suma);
        System.out.println("La resta es :" +resta);
        System.out.println("La division es :"+division);
        System.out.println("El producto es :" + producto);
    }
  
            
}
