package repositorio;

public class indiceenunarreglo {

    public static void main(String[] args) {

        int[] arreglo = {12, 41, 20, 45, 12};
        int indice = -5;
        int buscador = 60;
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i]==buscador){
                indice=i;
                break;
            }
        }
      if(indice!=-5){
          System.out.println("el elemmento: " + buscador + " se encunetra en el indice " + indice);
      }else {
          System.out.println("el elmento: " + buscador + " no se encuentra en el arreglo");
      }
    } 
}
