package Repositorio;

import java.util.Scanner;

public class SumaDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();
        
        int suma = 0;
        while (numero != 0){
            suma += numero % 10;
            numero /= 10;
        }
        
        System.out.println("La suma de los digitos del número ingresada: " + suma);
                
    }
    
}
