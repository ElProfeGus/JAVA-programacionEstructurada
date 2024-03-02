/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class segundoejercicio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 20;
        int numero;
        System.out.println("ingrese una serie de numero positivos");
        do {
            System.out.println("ingrese un numero");
            numero = sc.nextInt();
            //agregar al numero ala suma si es positivo
            if (numero >= 20) {
                suma += numero;

            }

        }while (numero >= 20);
        System.out.println("la suma de los numeros postivos es "+suma );
        sc.close();
    }

}
