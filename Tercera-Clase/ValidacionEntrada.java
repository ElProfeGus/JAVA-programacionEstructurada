package Repositorio;

import java.util.Scanner;

public class ValidacionEntrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        
        do{
            System.out.println("Ingrese un número del 1 al 100: ");
            numero = scanner.nextInt();
            
        } while ( numero < 1 || numero > 100 );
        
        System.out.println("Número valido ingresado: " + numero);
    }
            
    
}
