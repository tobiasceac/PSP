package Tema1.PracticaExamen;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ej1Hijo {
    public static void main(String[] args){


        try(BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            String linea;
            while((linea = br.readLine()) != null){
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            System.exit(1);
        } catch (IOException e){
            e.printStackTrace();
            System.exit(1);
        }
    }
}
