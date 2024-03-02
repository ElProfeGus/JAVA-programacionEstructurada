/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class cuartodia {

    public static void main(String[] args) {
        int[] arreglo = {5, 8, 9, 7,22,18,21,69,65,445};
        double promedio = encontrarpromedio(arreglo);
        for(int i=0;i<arreglo.length;i++){
            System.out.print(arreglo[i]+ " - ");
        }
        System.out.println("el promedio es " + promedio);
    }

    public static double encontrarpromedio(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("el arreglo no puede estar vacio");
        }
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        //calcular el promedio
        double promedio = (double) suma / array.length;
        return promedio;
    }
}
