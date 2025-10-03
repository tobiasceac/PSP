package Tema1.EjerciciosPDF;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;

public class Ej1_3V2 {
    public static void main(String[] args) throws IOException {

        Path pa = Path.of("out", "production", "PSP");

        File fi = new File(pa.toString());

        ProcessBuilder pb = new ProcessBuilder("java", "Tema1.EjerciciosPDF.Ej1_3");

        pb.directory(fi);
        Process p = pb.start();


        OutputStream os = p.getOutputStream();
        os.write("100 \n".getBytes());
        os.write("60 \n".getBytes());
        os.flush();
        os.close();

        try {
            InputStream is = p.getInputStream();
            int c;
            while ((c = is.read())!=-1){
                System.out.print((char) c);
            }
            is.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        try {
           int exitVal = p.waitFor();
            System.out.println("\n Valor de salida: " + exitVal);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
 