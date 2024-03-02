package RepositorioArrreglos;

import java.util.HashSet;

class ListNode{
    int val;
    ListNode si;
    
    ListNode(int val){
        this.val = val;
        this.si = null;
    }
}

public class ListaEnlazada {
    public static void main(String[] args) {
        // Creamos una lista enlazada de ejemplo con elementos duplicados
        ListNode cuerpo = new ListNode(1);
        cuerpo.si = new ListNode(2);
        cuerpo.si.si = new ListNode(3);
        cuerpo.si.si.si = new ListNode(2);
        cuerpo.si.si.si.si = new ListNode(4);
        cuerpo.si.si.si.si.si = new ListNode(3);
        
        
        System.out.println("Lista original");
        imprimirLista(cuerpo);
        
        
        // Llamamos a la función para eliminar duplicados
        ListNode resultado = eliminarDuplicados(cuerpo);
        
        
        System.out.println("\nLista sin duplicados");
        imprimirLista(resultado);
    }
    
    public static ListNode eliminarDuplicados(ListNode cuerpo){
        if (cuerpo == null) return null;
        
        HashSet<Integer> set = new HashSet<>();
        ListNode previo = null;
        ListNode siguiente = cuerpo;
        
        while (siguiente != null){
            if (set.contains(siguiente.val)){
                previo.si = siguiente.si;
            } else {
                set.add(siguiente.val);
                previo = siguiente;
            }
            
            siguiente = siguiente.si;
        }
        
        return cuerpo;
    }
    
    public static void imprimirLista(ListNode cuerpo){
        ListNode siguiente = cuerpo;
        while (siguiente != null){
            System.out.print(siguiente.val + " ");
            siguiente = siguiente.si;
        }
    }
    
}

