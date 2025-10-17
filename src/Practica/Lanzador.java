package Practica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Lanzador {
    public static void main(String[] args) throws IOException {

        String Comando = "CMD";
        String Comando2 = "/c";

        //Comando para reiniciar: "shutdown /r /t 1"
        //No funciona que el usuario introduzca
        //String Comando3 = args[0];

        String Comando3 = "shutdown /r /t 1";
        ProcessBuilder pb =  new ProcessBuilder("java", "-cp", ".", "Practica.Lanzado", Comando, Comando2, Comando3);

        Process p = pb.start();

        // Buffer para probar si lee
        try(BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()))){
            String linea;
            while((linea = br.readLine()) != null){
                System.out.println(linea);
            }

            int ExitValue = p.waitFor();
                if (ExitValue == 0){
                    System.out.println("Proceso Ejecutado correctamente");
                } else {
                    System.out.println("Error");
                }
                System.out.println(ExitValue);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
