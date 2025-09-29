package Tema1.EjerciciosPDF;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej1_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        try {
            num1 = sc.nextInt();
            num2 = sc.nextInt();

            int resultado = num1 + num2;
            System.out.print("El resultado es: " + resultado);

        } catch (Exception e) {
            System.out.println("No es un numero " + "\n" + e.getMessage());
        }



    }
}
