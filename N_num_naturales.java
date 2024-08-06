/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package n_num_naturales;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class N_num_naturales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 2, t, p;
        Scanner l = new Scanner(System.in);
        System.out.println("Digite la cantidad de elementos: ");
        t = l.nextInt();
        int v[] = new int[t];
        //dando valores a vector desde n = 2 hasta t 
        for (p = 0; p < t; p++) {
            v[p] = n;
            if (n % 2 == 0) {
               n = n - 1;
            }
            else {
                n = n + 3;
            }            
        }
        for (p = 0; p < t; p++) {
            System.out.print(+ v[p] +" , " );         
            }             
    }
    
}
