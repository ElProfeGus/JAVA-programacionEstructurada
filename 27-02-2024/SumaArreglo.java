
package Repositorio;
public class SumaArreglo {
    public static void main(String[] args) {
        // Crear un arreglo unidimensional inicializado
        int[] arreglo = {1, 2, 3, 4, 5};
        
        // Acceder al primer y segundo elemento del arreglo y almacenarlo en variables
        int primerElemento = arreglo[0];
        int segundoElemento = arreglo[1];
        
        // Modificar el tercer elemento  del arreglo, asignándole el valor 10
        arreglo[2] = 10;
        
        // Calcular la suma de los elementos del arreglo
        int sumaTotal = 0;
        for (int i = 0; i < arreglo.length; i++){
            sumaTotal += arreglo[i]; 
        }
        
        // Imprimir el arreglo original, el primer y segundo elemento, así como la suma total de los elementos
        System.out.println("Arreglo original: ");
        for(int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i]);
            if ( i < arreglo.length - 1){
                System.out.print(", ");
            }
        }
        
        System.out.println("?");
        System.out.println("Primer elemento: " + primerElemento + "\n" + 
                "Segundo elemento: " + segundoElemento + "\n" +
                "Suma total de los elementos: " + sumaTotal);
    }

}
