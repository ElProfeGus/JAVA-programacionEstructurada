
package Repositorio;

import java.util.Scanner;


public class Facturas {
    
    // semana 6 de programación -- Switch  if scanner funciones 
    // Semana 8 do while ---  para 
    // Semana 9 While }--- mientras
    // semana 10 For -- repetir hasta 
    
    // Semana 11 Arreglos 
    
    
    public static void main(String[] args) { // - llaves
        String[] juguetes = {"pelota", "camioneta", "corazon", "yanquenpo", "chapadas"};
        
        Scanner scanner = new Scanner(System.in);
        
        for ( int i = 0; i < juguetes.length; i++){
            System.out.println("Los juguetes que estan el la caja son: " + juguetes[i]);
        }
        
        System.out.print("Ingrese el nombre del juguete con el que quiere jugar: ");
        String jugueteNecesitado = scanner.nextLine();
      
        
        boolean encontrado = false;
        for ( String juguete : juguetes){
            if ( juguete.equalsIgnoreCase(jugueteNecesitado)){
                encontrado = true;
                break;
            } 
        }
        
        if (encontrado){
            System.out.println("El juguete \"" + jugueteNecesitado + "\" esta disponible!");
            
        } else {
            System.out.println("Lo siento, el juguete \"" + jugueteNecesitado + "\" no está lo encontre pipi ");
        }
    }
    
    
}
