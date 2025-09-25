package Tema1.EjerciciosPDF;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Ejecutar {

    public static void main(String[] args) throws IOException, InterruptedException {
        File d = new File("C:\\Users\\tobia\\IdeaProjects\\PSP\\src");

        ProcessBuilder pb = new ProcessBuilder("java","Tema1.EjerciciosPDF.LeerNombre", "Hola");

        pb.directory(d);
        System.out.print("Directorio de trabajo: ");
        System.out.println(pb.directory());


        Process p = pb.start();


        try(InputStream is = p.getInputStream();
            InputStream es = p.getErrorStream()) {
            int c;
            int a;

            while ((c = is.read())!=-1){
                System.out.print((char) c);
            }

            while ((a = es.read()) != -1) {
                System.err.print((char)a);
            }
        }

        p.waitFor();

    }
}

