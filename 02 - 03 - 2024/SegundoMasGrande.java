package Listas;
public class SegundoMasGrande {
    public static int encontrarSegundoMasGrande(int[] nums){
        if (nums.length < 2){
            System.out.println("La lista debe contener al menos dos elementos");
            return -1;
        }
        
        int primerMax = Integer.MIN_VALUE;
        int segundoMax = Integer.MAX_VALUE;
        
        for (int num : nums) {
            if (num > primerMax){
                segundoMax = primerMax;
                primerMax = num;
            } else if (num > segundoMax && num != primerMax){
                segundoMax = num;
            }
        }
        
        if ( segundoMax == Integer.MIN_VALUE){
            System.out.println("No hay sedundo elemento más grande en la lista: ");
            return -1;
        }
        
        return segundoMax;
    }
    
    public static void main(String[] args) {
        int[] lista = {100, 75, 7, 12, 50};
        int segundoMax = encontrarSegundoMasGrande(lista);
        
        if (segundoMax != -1){
            System.out.print("El segundo elemento más grande en la lista es: " + segundoMax);
        }
    }
    
}
