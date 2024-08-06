/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecicio_3;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Ejecicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int p, t, aux, num;
        boolean encontrado = false;
        System.out.println("Digite el tamaño del vector: ");
        t = l.nextInt();
        int v[] = new int[t];
        for (p = 0; p < v.length ; p++) {
            System.out.println("Digite el número:");
            v[p] = l.nextInt();
        }
        //ordenar vector de menor a mayor
        for (p = 0; p < t-1; p++) {
            for (int i = 0; i < t-1; i++) {
                if (v[i] > v[i+1]) {
                   aux = v[i];
                   v[i] = v[i+1];
                   v[i+1] = aux;
               }
            }
        }
        for (p = 0; p < t; p++) {
            System.out.print(v[p]+" , ");
        } 
        p = 0;
            while(encontrado == false) {
            System.out.println("Digite un número a encontrar en el vector:");
            num = l.nextInt(); 
                 if(v[p] == num) {
                   encontrado = true;
                   System.out.println("El número digitado está en el vector");
                 } 
                 else {
                     System.out.println("El número digitado no está en el vector");
                     p = p + 1;
                     if(p == t) {
                         p = 0;
                         System.out.println("Vector reiniciado a posición 0");
                     }
                 }
            } 
    }
}
