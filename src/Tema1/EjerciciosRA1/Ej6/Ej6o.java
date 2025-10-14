package Tema1.EjerciciosRA1.Ej6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ej6o {
    public static void main(String[] args){
        int cont = 0;

        try(BufferedReader br = new BufferedReader(new FileReader(args[0]))){
            String linea;
            while((linea = br.readLine()) != null){
                linea = linea.toLowerCase();
                for (int i = 0; i < linea.length(); i++){
                    char c = linea.charAt(i);
                    if (c == 'o'){
                        cont++;
                    }
                }
            }
            System.out.println("Número total de vocales 'o' en el archivo: " + cont);
        } catch (FileNotFoundException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            System.exit(1);
        } catch (IOException e){
            e.printStackTrace();
            System.exit(1);
        }
    }
}
