
package repositorio;
public class sumadearreglos {
    public static void main(String[] args) {
        float [] arreglo  = {1.5f , 5.5f , 8.4f , 48.8f};
        float suma= encontrarsuma(arreglo);
        System.out.println("la suma del arreglo es: " + suma);
    }
    public static float encontrarsuma(float [] arreglos){
        float suma = 0;
        for(float num:arreglos){
            suma += num;
        }
        return suma;
    }
}
