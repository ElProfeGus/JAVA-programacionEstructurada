package Repositorio;
public class SumaArreglo {
    public static void main(String[] args) {
        int[] arreglobidimensional = {2, 4, 6, 8, 10};
        
        int suma = 0;

        for ( int i = 0; i < arreglobidimensional.length; i++){            
            suma += arreglobidimensional[i];
        }
        
        System.out.println("La suma de los elementos del arreglo es: " + suma);
    }

}
