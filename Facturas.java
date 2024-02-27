/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repocitorio;

import java.util.Scanner;

/**
 *
 * @author revil
 */
public class Facturas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double total =0;
        double precioproducto;
        do{
            System.out.println("ingrese el precio del producto o numero 0 para finalizar");
            precioproducto= sc.nextDouble();
            total += precioproducto;
        }while(precioproducto!=0);
        System.out.println("todal de factura es: "+ total +" soles");
    }
    
}
