/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package correrpos_vectores;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Correrpos_vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int t, p, primero, ultimo;
        t = 5;
        Scanner l = new Scanner(System.in);
        int v[] = new int[t];
        for (p = 0; p < t; p++) {
            System.out.println("Digite un número:");
            v[p] = l.nextInt();
        }
        primero = v[0];
        for (p = 1; p < t; p++) {
           v[p-1] = v[p];             
        }
        v[t-1] = primero;
        for (p = 0; p < t; p++) {
            System.out.println(+v[p] + " , ");

        }
    }

}
