
package Repositorio;

import java.util.HashMap;
import java.util.Map;

public class MapaPersonas {
    public static void main(String[] args) {
        // Crear un mapa para almacenar nombres y edades de personas
        Map<String, Integer> personas = new HashMap<>();
        
        //gregar nombres y edades al mapa
        personas.put("Juan", 25);
        personas.put("Maria", 30);
        personas.put("Angelo", 18);
        personas.put("Efrain", 18);
        personas.put("Luis Angel", 18);
        personas.put("Gustavo", 17);
        
        
        // Acceder y mostrar la edad de una persona especifica
        String nombreBuscado = "Efrain";
        int edadEfrain = personas.get(nombreBuscado);
        System.out.print(nombreBuscado + " tiene "+ edadEfrain + " años");
        
        // Mostar todas las personas y sus edades en el mapa
        System.out.println("\nPersonas y sus edades");
        for(Map.Entry<String, Integer> entry : personas.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue() + " años");
        }
    }
    
}
