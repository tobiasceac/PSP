package Tema1.PracticaExamen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;


public class ej1 {
    public static void main(String[] args) throws IOException {

        // Windows  \
        Path file = Path.of("Tema1", "PracticaExamen", "Recursos", "texto.txt").toAbsolutePath();
        String Sfile = file.toString();


        ProcessBuilder pb = new ProcessBuilder("java", "-cp", ".", "Tema1.PracticaExamen.ej1Hijo",  Sfile);

        Process p = pb.start();

        try(BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
        ) {
            String linea;

            while ((linea = br.readLine()) != null){
                System.out.println(linea);
            }

            int exitValue = p.waitFor();
            System.out.println(exitValue);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
