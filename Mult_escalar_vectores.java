/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mult_escalar_vectores;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Mult_escalar_vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int t, p, ps = 0;
        Scanner l = new Scanner(System.in);
        System.out.println("Digite el tamaño de los vectores:");
        t = l.nextInt();
        int v[] = new int[t];
        int w[] = new int[t];
        for (p = 0; p < t; p++) {
            System.out.println(" [Vector v] Digite un número:");
            v[p] = l.nextInt();
        }
        for (p = 0; p < t; p++) {
            System.out.println(" [Vector w] Digite un número:");
            w[p] = l.nextInt();
        }
        for (p = 0; p < t; p++) {
            ps += v[p] * w[p];
        }
        System.out.println("El producto escalar del vector v[] y w[] es: " + ps);
    }
    
}
