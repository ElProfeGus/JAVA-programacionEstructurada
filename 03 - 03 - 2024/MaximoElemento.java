package Arreglos;

public class MaximoElemento {

    public static void main(String[] args) {
        // Arreglo de ejemplo
        int[] arreglo = {10, 23, 7, 45, 98, 32};

        // Llama a la función para encontrar el máximo
        int maximo = encontrarMaximo(arreglo);
        
        // Imprime el resultado
        System.out.println("El elemento máximo en el arreglo es: " + maximo);
    }
    
    // Función para encontrar el máximo elemento en el arreglo
    public static int encontrarMaximo(int[] arreglo){
        // Suponemos que el primer elemento es el máximo inicialmente
        int maximo = arreglo[0];
        
        // Recorremos el arreglo para encontrar el máximo 
        for (int i = 1; i < arreglo.length; i++) {
            // Si encontramos un elemento mayor, actualizamos el máximo
            if (arreglo[i] > maximo){
                maximo = arreglo[i];
            }
        }
        // Devolvemos el máximo encontrado
        return maximo;
    }
}
