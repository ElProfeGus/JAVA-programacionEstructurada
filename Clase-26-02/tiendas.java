
package repositorio;

import java.util.Scanner;

public class tiendas {
    public static void main(String[] args) {
        Scanner respuesta = new Scanner (System.in);
        double suma=0;
        System.out.println("cuantos productos desea comprar");
        int productos = respuesta.nextInt();
        for (int i = 1; i <=productos; i++){
            System.out.println("cual es el precio del producto " + i);
            double precio = respuesta.nextDouble();
             suma += precio ;
            //suma = suma + precio;
        }
        System.out.println("la suma de sus productos es: " + suma);
        
        
    }
    
}
