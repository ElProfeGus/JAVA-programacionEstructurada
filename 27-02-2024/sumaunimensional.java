
package repositorio;

import java.util.Scanner;

public class sumaunimensional {
    public static void main(String[] args) {
        Scanner respuesta = new Scanner (System.in);
        System.out.println("ingrese el tamaño del arreglo");
        int tamano = respuesta.nextInt();
        //crear un arreglo unidimensional
        int uni [] = new int[tamano];
        System.out.println("ingrese los valores del arreglo");
        for(int i=0; i<tamano; i++){
            System.out.println("elemento " + (i+1));
            uni[i]=respuesta.nextInt();
            
        }
            int s1 =0, s2=0;
            for(int i=0; i<tamano; i++){
                if(uni[i]%2 ==0){
                    s1 += uni[i];
                }else {
                    s2 += uni[i];
                }
            }
            System.out.println("la suma de los numeros enteros del arreglo es: "
            + s1 + "\n" + "la suma de los numeros impares es: " + s2 );
        
    }
          
}
