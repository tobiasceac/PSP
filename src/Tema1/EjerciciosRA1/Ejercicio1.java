package Tema1.EjerciciosRA1;

public class Ejercicio1 {
    public static void main(String[] args) {
        int num = 10;

        System.out.println("Los divisores de" + num + "son: ");

        for (int i = 1; i <= num; i++) {
            if(i%2==0){
                System.out.println(i + " ");
            }
        }
    }
}
