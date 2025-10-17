package Practica;

import java.io.*;

public class Lanzado {
    public static void main(String[] args) throws IOException {

        ProcessBuilder pb = new ProcessBuilder("java", "-cp", ".", "Practica.Lanzado");

        // test
        /*String com = args[0];
        System.out.println("Comando: " + com);*/

        try {
            pb.command(args[0], args[1], args[2]);

            Process p = pb.start();
            p.waitFor();
        } catch (InterruptedException e){
            e.printStackTrace();
            System.exit(1);
        }
    }
}
