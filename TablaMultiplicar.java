package Repositorio;

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número para obtener su tabla de multiplicar: ");
        int numero = sc.nextInt();
        
        int i = 1;
        while ( i <= 10){
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
                    
        }
    }
    
}
