
package repositorio;
public class elementogrande {
    public static void main(String[] args) {
        
        int[] arreglo = {11, 2, 4, 100, 215, 1, -542, 4};
        int operacion = arreglo[0];
        for(int i = 1; i<arreglo.length; i++){
            if(operacion>arreglo[i]){
                operacion = arreglo[i];
            }
        }
        System.out.println("el numero grande es: " + operacion);
    }
}
