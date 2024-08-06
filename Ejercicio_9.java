/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_9;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int p, n1 = 1, n2 = 150;
        int v[] = new int[150];
        for (p = 0; p < v.length; p++) {
            v[p] = n1;
            n1 += 1; 
            System.out.println(v[p]+ " , ");  
        }
        System.out.println("--------------------");
        for (p = 0; p < v.length; p++) {
            v[p] = n2;
            n2 -= 1;
            System.out.println(v[p]+ " , ");  
        }
    }
    
}
