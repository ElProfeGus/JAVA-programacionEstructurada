package repositorio;

import java.util.Random;
import java.util.Scanner;

public class Calificaiones3 {

    public static void main(String[] args) {
        Scanner respuesta = new Scanner(System.in);
        System.out.println("Ingrese el numero de estudiantes: ");
        int estudiantes = respuesta.nextInt();
        System.out.println("ingrese el numero de cursos: ");
        int cursos = respuesta.nextInt();
        //creando una matriz 
        double[][] panda = new double[estudiantes][cursos];
        Random random = new Random ();
        //Ingresando calificaciones
        for (int i = 0; i < estudiantes; i++) {
            System.out.println("Ingrese la calificacion del estudiante: " + (i + 1));
            for (int j = 0; j < cursos; j++) {
                System.out.println("Calificacion del curso" + (j + 1));
                panda[i][j] = random.nextDouble();

            }
        }
        double[] promedio1 = new double[estudiantes];
        double[] promedio2 = new double[cursos];
        for (int i = 0; i < estudiantes; i++) {
            double suma = 0;
            for (int j = 0; j < cursos; j++) {
                suma += panda[i][j];
                promedio2[j] += panda[i][j];

            }
            promedio1[i] = suma / cursos;

        }
        for (int j = 0; j < cursos; j++) {
            promedio2[j] /= estudiantes;

        }

        for (int i = 0; i < estudiantes; i++) {
            for (int j = 0; j < cursos; j++) {
                System.out.println(panda[i][j] + "\t");
            }
            System.out.println("promedio:" + promedio1[i]);
        }
        System.out.println("\n promedio del curso");
        for (int j = 0; j < cursos; j++) {
            System.out.println("curso: "+(j+1)+promedio2[j]);
            
            
        }
respuesta.close();
    }

}
