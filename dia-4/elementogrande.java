package Repositorio;
public class elementogrande {
    
    public static void main(String[] args) {
        int[] arreglo = {11, 2, 4, 100, 215};
        
        int operacion = arreglo[0];
        
        
        for (int i = 1; i < arreglo.length; i++){
            if (arreglo[i] > operacion){
                operacion = arreglo[i];
            }
        }
        
        System.out.println("El número grande es: " + operacion);
                
    }
    
}
