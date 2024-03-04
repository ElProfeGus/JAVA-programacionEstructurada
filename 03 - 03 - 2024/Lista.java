package Arreglos;

import java.util.HashSet;

class Nodo {

    int valor;
    Nodo siguiente;

    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
    }
}

class listaenlazada {

    Nodo frente;

    public listaenlazada() {
        frente = null;

    }

    public void insertar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (frente == null) {
            frente = nuevoNodo;
        } else {
            Nodo time = frente;
            while (time.siguiente != null) {
                time = time.siguiente;
            }
            time.siguiente = nuevoNodo;
        }
    }

    public void eliminar() {
        HashSet<Integer> conjunto = new HashSet<>();
        Nodo previo = null;
        Nodo actual = frente;
        while (actual != null) {
            if (conjunto.contains(actual.valor)) {
                previo.siguiente = actual.siguiente;

            } else {
                conjunto.add(actual.valor);
                previo = actual;
            }
            actual = actual.siguiente;
        }
    }

    public void imprimir() {
        Nodo time = frente;
        while (time != null) {
            System.out.println(time.valor + " ");
            time = time.siguiente;
        }
        System.out.println();
    }

}

public class Lista {

    public static void main(String[] args) {
        listaenlazada lista = new listaenlazada();
        lista.insertar(1);
        lista.insertar(2);
        lista.insertar(3);
        lista.insertar(4);
        lista.insertar(2);
        lista.insertar(3);
        System.out.println("lista original:");
        lista.imprimir();
        //metodo de eliminar numeros
        lista.eliminar();
        System.out.println("lista sin duplicado");
        lista.imprimir();

    }
}
