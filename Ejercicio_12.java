/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_12;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int pa, pb, pc, na = 1, nb = 1;
        int A[] = new int[20];
        int B[] = new int[20];
        int C[] = new int[20];
        for (pa = 0; pa < A.length; pa++) {
           A[pa] = na;
           na += 1;
           System.out.println(A[pa]);
        }
        System.out.println("---------------");
        for (pb = 0; pb < B.length; pb++) {
           B[pb] = nb;
           nb += 1;
           System.out.println(B[pb]);
        }
        System.out.println("---------------");
        pa = 0;
        pb = 20;
        for (pc = 0; pc < C.length; pc++) {
         C[pc] = A[pa]*B[pb];
        pa += 1;
        pb -= 1;
         System.out.println(C[pc]);
        }
    }
    
}
