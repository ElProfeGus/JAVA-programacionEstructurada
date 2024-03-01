package Repositorio;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner respuesta = new Scanner(System.in);
        char opcion; // S - N 
        
        do{
            System.out.println("Ingrese el valor de n para encontrar el termino correspondiente en la secuencia Fibonnaci ");
            int n = respuesta.nextInt();
            
            if (n < 0){
                System.out.println("El valor de n debe ser un numero no negativo");
            } else {
                int fibonacciActual = 0;
                int fibonacciAnterio = 1;
                int resultado = 0; 
                
                // Calcular el termino de Fibonnaci
                int i = 1;
                
                while ( i < n){
                    resultado = fibonacciActual + fibonacciAnterio;
                    fibonacciAnterio = fibonacciActual;
                    fibonacciActual = resultado;
                    i++;
                }
                
                System.out.println("El termino número " + n + " de la secuencia de Fibonacci es: " + resultado );
            }
            System.out.println("¿Desea continuar? (s / n)");
            opcion = respuesta.next().charAt(0);
            
        } while (opcion == 's' || opcion == 'S');
        
        respuesta.close();
    }
}
