/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repeti;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class repeti {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        char opcion;
        do {
            System.out.println("ingrese un numero positivo");
            numero = scanner.nextInt();
            if (numero <= 0) {
                System.out.println("por favor ingrese un numero positivo");

            } else {
                System.out.println("elija el bucle(1..for  2..do while  3..while");
                opcion = scanner.next().charAt(0);
                switch (opcion) {
                    case 1:
                        sumaconfor(numero);
                        break;
                    case 2:
                        sumacondowhile(numero);
                        break;
                    case 3:
                        sumawhile(numero);
                        break;
                    default:
                        System.out.println("opcion no valida");
                        break;

                }
            }
            System.out.println("desea calcular la suma de nuevo");
            opcion = scanner.next().charAt(0);
        } while (opcion == 's' || opcion == 'S');
    }
}
