package Tema1.EjerciciosRA1;

import java.io.*;
import java.util.Scanner;

public class Ej5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        System.out.print("Introduce el numero desde: ");
        int desde = sc.nextInt();
        System.out.print("Introduce el numero hasta: ");
        int hasta = sc.nextInt();


        int suma = 0;

        try(BufferedReader br = new BufferedReader(new FileReader("src/Tema1/EjerciciosRA1/numeros.dat"))) {
            String linea;
            int cont = 1;
            
            while ((linea = br.readLine()) != null){
                int numero = Integer.parseInt(linea.trim());
                
                if (cont >= desde && cont <= hasta){
                    suma += numero;
                }
                cont++;
            }
            
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("El archivo contiene datos no validos.");
        }

        System.out.println("El resultado es: " + suma);
    }
}
