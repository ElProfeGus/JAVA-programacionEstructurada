package Repositorio;
public class ContarPares {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int contadorPares = 0;
        
        for ( int i = 0; i < arreglo.length; i++){
            if (arreglo[i] % 2 == 0){
                contadorPares++;
            }
        }
        
        System.out.println("El número de elementos para en el arreglo es: " + contadorPares);
        
    }
            
    
}
