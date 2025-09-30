package Tema1.Ejemplos;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Ejemplo03 {

    public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//creamos objeto File al directorio donde est� Ejemplo2
        File d = new File("C:\\Users\\tobia\\IdeaProjects\\PSP\\src");
        //proceso a ejecutar es Ejemplo2
        ProcessBuilder pb = new ProcessBuilder("java","Tema1.Ejemplo04");
        //establecemos el directorio donde est� el ejecutable
        pb.directory(d);
        System.out.print("Directorio de trabajo: ");
        System.out.println(pb.directory());
        //ejecutar proceso
        Process p = pb.start();
        //obtener la salida
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
	}
}
