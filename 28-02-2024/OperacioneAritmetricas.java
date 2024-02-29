package Repositorio28_02_2024;

import java.util.Scanner;

public class OperacioneAritmetricas {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Inicializar
        int num1, num2;
        double division = 0;
        
        // Entrada
        System.out.println("Ingrese un número: ");
        num1 = scanner.nextInt();
        System.out.println("Ingrese otro número: ");
        num2 = scanner.nextInt();
        
        // Operaciones
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        if (num2 != 0){
            division = (double) num1 / num2;
        } else {
            System.out.println("Es indeterminado");
        }
        
        // Salida
        System.out.println("El resultado de la suma: " + suma + "\n" + 
                "El resultado de la resta: " + resta + "\n" + 
                "El resultado de la multiplicación: " + multiplicacion + "\n"+
                "El resultado de la división es: " + division);
        
        
    }
    
}
