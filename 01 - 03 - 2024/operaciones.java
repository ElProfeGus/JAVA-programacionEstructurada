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
public class operaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double divi = 0;
        //Entrada
        System.out.println("ingrese el primer espacio");
        int numero1 = sc.nextInt();
        System.out.println("ingrese el segundo numero");
        int numero2 = sc.nextInt();
        
        //proceso
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multi = numero1 * numero2;
        if (numero2!= 0){
            divi= (double)numero1/numero2;
            
        }else {
            System.out.println("error");
                 
        }
            System.out.println("la suma es "+suma+"\n"+
                    "la resta es "+resta+"\n"+
                    "la multi es "+multi+"\n"+
                    "la divi es "+divi);
        
        
    }
    
}
