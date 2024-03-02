
package repositorio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class invertirlista {
    public static void main(String[] args) {
        List<Integer> lista=new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        
        System.out.println("lista original: " + lista);
        
        //funcion de invertir lista 
        Collections.reverse(lista);
        System.out.println("lista invertida: " + lista);
    }
   
}
