package Repositorio;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número para calcular su factorial: ");
        int n = scanner.nextInt();
        
        int factorial = 1;
        int i = 1;
        
        while(i <= n){
            factorial *= i;
            i++;
        }
        
        System.out.println("El facotiral de " + n + " es: " + factorial);
                
    }
}
