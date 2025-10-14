package Tema1.EjemploPracticaRA1;

import java.io.File;
import java.io.IOException;

public class Padre {
    public static void main(String[] args) throws IOException, InterruptedException {


        String fileJava = args[0];
        String fileDestino = args[1];

        ProcessBuilder pb = new ProcessBuilder("javac", "Tema1/EjemploPracticaRA1/", fileJava);

        pb.directory(new File("/Users/tobias/IdeaProjects/PSP/src"));

        Process p = pb.start();

        int exitCode = p.waitFor();
        if (exitCode == 0) {
            System.out.println("Compilación completada correctamente ");
        } else {
            System.out.println("Error al compilar  (código " + exitCode + ")");
        }
    }
}
