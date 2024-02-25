package Repositorio;
public class indiceenunarreglo {
    public static void main(String[] args) {
        
        int[] arreglo = {12, 41, 20, 7, 12};
        
        int indice = -8;
        int buscador = 75;
        
        for( int i = 0; i < arreglo.length; i++){
            if ( arreglo[i] == buscador){
                indice = i;
                break;
            }
        }
        
        if(indice != -8){
            System.out.println("El elemento " + buscador + " se encuentra en: " + indice);
        } else {
            System.out.println("El elemento " + buscador + " no se encuentra en el arreglo");
        }
        
        
    }
    
}
