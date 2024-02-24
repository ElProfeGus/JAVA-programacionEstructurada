package Repositorio;

import java.util.Scanner;

public class Suma_Numeros_Pares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero positivo: ");
        int n = sc.nextInt();
        
        int suma = 0;
        int i = 2;
        
        while (i <= n){
            suma += i;
            i += 2;
        }
        
        System.out.println("La suma de los números pares hasta " + n + " es: " + suma);
                
    }
    
}
