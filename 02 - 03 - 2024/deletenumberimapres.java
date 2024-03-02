package repositorio;

import java.util.ArrayList;
import java.util.List;

public class deletenumberimapres {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(45);
        lista.add(24);
        lista.add(51);
        lista.add(26);
        lista.add(12);

        System.out.println("lista original: " + lista);
        //eliminar elementos impares
        List<Integer> li = new ArrayList<>();
        for (int num : lista) {
            if(num % 2 == 0){
                li.add(num);
            }
            
        }
        System.out.println("la lista son lis numeros impares es: " + li);
    }
}
