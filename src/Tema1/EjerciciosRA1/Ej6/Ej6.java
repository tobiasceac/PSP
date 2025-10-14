package Tema1.EjerciciosRA1.Ej6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;

public class Ej6 {
    public static void main(String[] args) throws IOException {
        Path file = Path.of("/Users", "tobias", "IdeaProjects", "PSP", "src", "Tema1", "EjerciciosRA1", "Ej6", "texto2.txt");
        String fileString = file.toString();

        ProcessBuilder pba = new ProcessBuilder("java", "-cp", ".", "Tema1.EjerciciosRA1.Ej6.Ej6a", fileString);
        ProcessBuilder pbe = new ProcessBuilder("java", "-cp", ".", "Tema1.EjerciciosRA1.Ej6.Ej6e", fileString);
        ProcessBuilder pbi = new ProcessBuilder("java", "-cp", ".", "Tema1.EjerciciosRA1.Ej6.Ej6i", fileString);
        ProcessBuilder pbo = new ProcessBuilder("java", "-cp", ".", "Tema1.EjerciciosRA1.Ej6.Ej6o", fileString);
        ProcessBuilder pbu = new ProcessBuilder("java", "-cp", ".", "Tema1.EjerciciosRA1.Ej6.Ej6u", fileString);

        Process ppba = pba.start();
        Process ppbe = pbe.start();
        Process ppbi = pbi.start();
        Process ppbo = pbo.start();
        Process ppbu = pbu.start();

        manejarProceso(ppba, "A");
        manejarProceso(ppbe, "E");
        manejarProceso(ppbi, "I");
        manejarProceso(ppbo, "O");
        manejarProceso(ppbu, "U");

    }

    private static void manejarProceso(Process p, String nombre) {
        try (
                BufferedReader out = new BufferedReader(new InputStreamReader(p.getInputStream()));
                BufferedReader err = new BufferedReader(new InputStreamReader(p.getErrorStream()))
        ) {
            String linea;

            // Lee salida estandar
            while ((linea = out.readLine()) != null) {
                System.out.println(nombre + " OUT -> " + linea);
            }

            // Lee errores
            while ((linea = err.readLine()) != null) {
                System.err.println(nombre + " ERR -> " + linea);
            }

            // Espera a que termine el proceso
            int exitValue = p.waitFor();
            System.out.println(nombre + " terminado con código " + exitValue);
        } catch (IOException | InterruptedException e) {
            System.err.println("Error manejando proceso " + nombre);
            e.printStackTrace();
        }
    }
}