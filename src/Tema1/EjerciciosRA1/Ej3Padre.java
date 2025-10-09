package Tema1.EjerciciosRA1;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

public class Ej3Padre {
    public static void  main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Manda una peticion para recibir un numero aleatorio: ");
        String peticion = sc.next();

        ProcessBuilder pb = new ProcessBuilder("java", "-cp", ".", "Tema1.EjerciciosRA1.Ej3Hijo");

        Process p = pb.start();

        try(BufferedReader salida = new BufferedReader(new InputStreamReader(p.getInputStream()))){
            OutputStream os = p.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true);
            while(!peticion.equalsIgnoreCase("fin")){
                pw.println(peticion);
                String resultado = salida.readLine();
                System.out.println("El resultado es: "+ resultado);
                System.out.print("Manda una peticion para recibir un numero aleatorio: ");
                peticion = sc.next();
            }
        }
    }
}
