package Tema1.EjerciciosRA1;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

public class Ej2Padre {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();

        Path pa = Path.of("out", "production", "PSP");
        File fi = new File(pa.toString());

        ProcessBuilder pb = new ProcessBuilder("java", "Tema1.EjerciciosRA1.Ej2Hijo");

        pb.directory(fi);
        Process p = pb.start();

        OutputStream os = p.getOutputStream();
        PrintWriter pw = new PrintWriter(os, true);
        pw.println(numero);
        pw.close();

        try(BufferedReader salida = new BufferedReader(new InputStreamReader(p.getInputStream()))){

            String resultado = salida.readLine();
            System.out.println("Resultado: " + resultado);
        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            int exitVal = p.waitFor();
            System.out.println("\n Valor de salida: " + exitVal);
        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
