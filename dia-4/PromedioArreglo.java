package Repositorio;

import java.util.Random;
import java.util.Scanner;

public class PromedioArreglo {
    public static void main(String[] args) {
        Scanner respuesta = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del arreglo: ");
        int tamano = respuesta.nextInt();
        
        
        int[] arreglo = new int[tamano];
        
        System.out.println("Ingrese los elementos del arreglo:");
        for(int i = 0; i < tamano; i++){
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = respuesta.nextInt();
        }
        
        int suma = 0;
        
        for( int i = 0; i < arreglo.length; i++){
            suma += arreglo[i];
        }
        
        double promedio = (double) suma / arreglo.length;
        System.out.println("El promedio de los elementos del arreglo es: " + promedio);
        
        respuesta.close();
    }
    
}
