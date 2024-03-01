package Repositorio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        // Crear una lista para almacenar nombres de personas
        List<String> nombres = new ArrayList<>();
        
        // Agregar nombres a la lista
        nombres.add("Angelo");
        nombres.add("Efrain");
        nombres.add("Luis Angel");
        nombres.add("Gustavo");
        nombres.add("Lizbhet");
        
        
        // Mostrar los nombres en el orden que fueron agregados
        System.out.println("Nombres en el orden original: ");
        for(String nombre : nombres){
            System.out.println(nombre);
        }
        
        // Mostrar los nombres en orden inverso
        System.out.println("\nNombres en orden inverso");
        Collections.reverse(nombres);
        for (String nombre : nombres){
            System.out.println(nombre);
        }
        
    }
    
}
