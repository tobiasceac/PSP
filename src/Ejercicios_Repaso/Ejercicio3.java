package Ejercicios_Repaso;

import java.util.Scanner;
/*Leer 5 elementos numéricos que se introducirán ordenados de forma creciente. Éstos
los guardaremos en un array de tamaño 10. Leer un número N, e insertarlo en el lugar
adecuado para que el array continúe ordenado.*/
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla = new int[10];

        for(int i = 0; i < 10; i++) {
            tabla[i] = sc.nextInt();
        }

        System.out.print("Introduce un numero: ");
        int N = sc.nextInt();

        for(int i = 0; i < N; i++) {


        }

    }
}
