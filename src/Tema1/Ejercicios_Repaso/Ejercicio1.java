package Tema1.Ejercicios_Repaso;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();


        for(int i = 0; i < 5; i++) {
            System.out.print( "Introduce un número: " );
            int numero = sc.nextInt();
            lista.add(numero);
        }
        System.out.println(lista);
    }
}
