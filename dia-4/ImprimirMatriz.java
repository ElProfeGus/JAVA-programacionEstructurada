package Matrices;

import java.util.Scanner;

public class ImprimirMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número de filas de la matriz: ");
        int filas = scanner.nextInt();
        
        System.out.print("Ingrese el número de columas de la matriz: ");
        int columnas = scanner.nextInt();
        
        int[][] matriz = new int[filas][columnas];
        
        System.out.println("Ingrese los elementos de la matriz: ");
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                System.out.println("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("La matriz ingresada es:");
        for (int i = 0; i < filas; i++){
            for ( int j = 0; j < columnas; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
