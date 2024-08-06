/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_13;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Ejercicio_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int t, p, numanterior = 0, numsiguiente = 1, n;
        System.out.println("Digite cuantos números se van a mostrar");
        t = l.nextInt();
        int FIB[] = new int[t+1];
        for (p = 1; p < FIB.length; p++) {
            n = numanterior;
            numanterior = numsiguiente + numanterior;
            numsiguiente = n;
            FIB[p] = n;
            
        }
        for (p = 1; p < FIB.length ; p++) {
            System.out.println(+FIB[p]);
        }
    }
    
}
