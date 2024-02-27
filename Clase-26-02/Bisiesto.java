package Repositorio;

import java.util.Scanner;

public class Bisiesto {
    public static void main(String[] args) {
        Scanner respuesta = new Scanner(System.in);
        
        // Entrada
        System.out.println("Ingresa el número del mes ( 1 - 12):");
        int mes = respuesta.nextInt();
        
        int dias = 0;
        
        // switch = segun
        // case = caso
        
        // Proceso
        switch (mes){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dias = 31;
                break;
            case 4: case 6: case 9: case 11:
                dias = 30;
                break;
            case 2:
                System.out.println("Ingresa el año: ");
                int a = respuesta.nextInt(); 
                if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
                    dias = 29;
                } else {
                    dias = 28;
                }
                break;
            default:
                System.out.println("Número de mes invalido");
                break;
        }
        
        // Salida
        System.out.println("El mes " + mes + " tiene " + dias + " dias");
                
    }
            
    
}
