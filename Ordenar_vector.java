/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenar_vector;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Ordenar_vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int t, p, aux;
        System.out.println("Digite el tamaño del vector:");
        t = l.nextInt();
       int  v[] = new int[t];
        for (p = 0; p < t; p++) {
            System.out.println("Digite un número:");
            v[p] = l.nextInt();
        }
        for (p = 0; p < t-1; p++) {
            for (int i = 0; i < t-1; i++) {
               if (v[i] > v[i+1]) {
                   aux = v[i];
                   v[i] = v[i+1];
                   v[i+1] = aux;
               }
                
            }
  
          }
        System.out.println("Arreglo ordenado");
        for (p = 0; p < t; p++) {
            System.out.print(+v[p]+ " , ");  
        }
         
    }
    
}
