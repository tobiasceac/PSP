package Ejercicios_Repaso;

import java.util.Scanner;

/*Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de la
forma: el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc.*/
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tablaA = new int[10];
        int[] tablaB = new int[10];
        int[] tablaC = new int[20];

        System.out.println("Introduce los números de la tabla A:");
        for(int i = 0; i < 10; i++) {
            tablaA[i] = sc.nextInt();
        }

        System.out.println("Introduce los números de la tabla B:");
        for(int i = 0; i < 10; i++) {
            tablaB[i] = sc.nextInt();
        }

        int index = 0;
        for (int i = 0; i < 10; i++) {
            tablaC[index++] = tablaA[i];
            tablaC[index++] = tablaB[i];
        }

        System.out.println("Tabla C mezclada:");
        for(int i = 0; i < 20; i++) {
            System.out.print(tablaC[i] + " ");
        }
    }
}
