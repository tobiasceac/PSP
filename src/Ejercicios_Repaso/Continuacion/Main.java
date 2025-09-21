package Ejercicios_Repaso.Continuacion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Alumno[] alumnos = new Alumno[6];

        String[] nombres = {"Juan", "Ana", "Luis", "Marta", "Carlos", "Sofia"};
        int[] notas = {6, 8, 4, 9, 5};

        try {
            for (int i = 0; i < nombres.length; i++) {
                alumnos[i] = new Alumno(nombres[i], notas[i]);
            }

            int notaTotal = 0;
            for (Alumno alumno : alumnos) {
                notaTotal += alumno.getNota();
            }

            double media = (double) notaTotal / alumnos.length;
            System.out.println("La nota media es: " + media);
        } catch (Exception e) {
            System.out.println("Error al calcular la media: " + e.getMessage());
        }

    }
}
