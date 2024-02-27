
package repositorio;

import java.util.Scanner;



public class Verificador {
    public static void main(String[] args) {
        Scanner respuesta = new Scanner (System.in);
        final String contrasena = "tuemotsit0masna?";
        boolean contrasenacorrecta = false;
        int i=3;
        
       while (contrasenacorrecta !=false ||i!=0)   {
           System.out.println("Ingrese la contraseña: ");
           String contrasenas = respuesta.nextLine();
           if (contrasenas.equals(contrasena))  {
               contrasenacorrecta = true;
               System.out.println("contraseña correcta, felicitaciones");
           }else {
               System.out.println("contraseña incorrecta pipipi");
               i--;
           }
       }
       if (i==0)    {
           System.out.println("cuenta bloqueada cagaste");
       }
    }
}
