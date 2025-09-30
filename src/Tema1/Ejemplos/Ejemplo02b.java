package Tema1.Ejemplos;

import java.io.IOException;
import java.io.InputStream;

public class Ejemplo02b {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Ejecutamos el proceso DIR
        Process p = new ProcessBuilder("CMD","/C","DIRR").start();
        
        //Mostramos caracter a caracer la salida del comando
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
        
        //Vemos si se ha producido alg�n error
        try {
            InputStream er = p.getErrorStream();
            int c;
            while ((c = er.read())!=-1){
                System.out.print((char) c);
            }
            er.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
	}

}
