
package repositorio;

import java.util.Scanner;

public class contadordedigitos {
    public static void main(String[] args) {
        Scanner respuesta = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num = respuesta.nextInt();
        int i =0;
        int auxiliar = num;
        while (num != 0){
            num = (int) Math.floor(num/10);
           i++;   
        }
        System.out.println("los digitos del numero " + auxiliar + " es " + i);
    }
    
}
