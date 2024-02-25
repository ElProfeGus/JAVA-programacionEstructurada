
package Matrices;
public class SumadeMatricez {
    public static void main(String[] args) {
        
        int [][] matriz = {{1,2},{3,4}};
        int suma = 0;
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                suma += matriz[i][j];
            }                
        }
        System.out.println("la suma de los elementos es: " + suma);
    }
}
