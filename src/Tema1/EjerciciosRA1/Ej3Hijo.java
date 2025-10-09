package Tema1.EjerciciosRA1;

import java.util.Scanner;

public class Ej3Hijo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String peticion = sc.next();

        while (!peticion.equalsIgnoreCase("fin")) {
            int random = (int) (Math.random() * 10);
            System.out.println(random);
            System.out.flush();
            peticion = sc.next();
        }
    }
}
