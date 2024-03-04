
package Arreglos;


/**
 *
 * @author revil
 */
public class Suma {

    public static void main(String[] args) {
        float[] arreglo = {3.5f, 2.1f, 4.7f, 1.2f};
        float suma = encontrarsuma(arreglo);
        System.out.println("la suma de todos los elementos es: " + suma);
    }

    //funcion para encontrar la suma
    public static float encontrarsuma(float[] arreglo) {
        float suma = 0.0f;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];

        }
        //devolvemos la suma total
        return suma;
    }

}

