package Repositorio28_02_2024;

import java.util.Scanner;

public class EjemploForPara {
    public static void main(String[] args) {
        Scanner respuesta = new Scanner(System.in);
        
        int suma = 0;
        System.out.print("Ingrese un numero N: ");
        int n = respuesta.nextInt();
        
        /*
        Para ( i <- 1 Hasta 5 Con Paso 2 ) Hacer
              suma <- suma + numero
        FinPara
        
        i =  1 
        i = 2
        i = 3
        i = 4
        i = 5
        i = 6
        */
        for (int i = 1; i <= 10; i ++){
            suma += i;
        }
        
        System.out.println("La suma es: " + suma);
        
                
    }
    
}
