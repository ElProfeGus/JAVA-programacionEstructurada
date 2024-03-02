package repositorio;

import java.util.ArrayList;
import java.util.List;

public class sumadelista {

    public static void main(String[] args) {
        List<Float> lista = new ArrayList<>();
        lista.add(1.5f);
        lista.add(4.1f);
        lista.add(4f);
        lista.add(45f);
        lista.add(8.5f);

        float suma = 0.0f;
        for (Float numero : lista) {
            suma+=numero;
            
        }
        System.out.println("la suma de los elemntos de la lista es: " + suma);
    }
}
