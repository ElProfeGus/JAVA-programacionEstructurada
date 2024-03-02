package RepositorioArrreglos;
public class MaximoElemento {
    public static void main(String[] args) {
        // int arreglo = 5;
        int[] arreglo = {}; // Aqui definimos nuestro arreglo
        
        int maximo = encontrarMaximo(arreglo); // Llamamos a la función para encontrar el numero maximo
        
        System.out.println("El elemento máximo en el arreglo es: " + maximo);
    }
    
    public static int encontrarMaximo(int[] arreglo){
        if (arreglo.length == 0){
            throw new IllegalArgumentException("El arreglo no puede estar vacio");
        }
        
        int max = arreglo[0]; // Empezamos asumiendo que el primer elemento es el maximo
        
        
        // Iteramos sobre el arreglo desde el segundo elemento
        for (int i = 1; i < arreglo.length; i++){
            if (arreglo[i] > max){ // Si encontramos un elmento mayor que el actual ese sería el nuevo maximo
                max = arreglo[i];
            }
        }
        
        return max; // Retornamos él máximo encontrado
    }
    
}
