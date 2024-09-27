package funcion_001;

public class Funcion_001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //llamando a la función par_impar
        boolean a = par_impar(3);
        System.out.println(a);
       //llamando al procedimiento tabla
        tabla (5);
        //llenando vector
        int v[] = {7,2,4,6,10};
        int b;
        //llamando el procedimiento
        b = mayor(v);
        System.out.println("Numero mayor =" +b);
        //llenando el vector
        int A[] = {1,2,3,4,5};
        int c = suma(A);
     System.out.println("La suma de los elementos es " +c);
    }
    //función tabla
   public static boolean par_impar (int num){
       return num % 2 == 0;
   } 
   
   //procedimiento tabla
   public static void tabla (int num2){
       for (int i = 1; i <= 10; i++) {
         System.out.println(i+ "*" +num2+ "=" +i*num2);
       }
   }
   public static int mayor(int v[]){
       int mayor = -999999999;
       for (int i = 0; i < v.length; i++) {
           if (v[i] > mayor) {
           mayor = v[i];    
           } 
       }
       return mayor;
   }   
   //función suma
   public static int suma(int A[]) {
      int suma = 0;
       for (int i = 0; i < A.length; i++) {
           suma = A[i] + suma;
         
       }
       return suma;
   }
}
