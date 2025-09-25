package Tema1.EjerciciosPDF;

/*
    PS C:\Users\tobia\IdeaProjects\PSP\src> javac Tema1\EjerciciosPDF\LeerNombre.java
    PS C:\Users\tobia\IdeaProjects\PSP\src> java Tema1.EjerciciosPDF.LeerNombre hola
   */

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeerNombre {
    public static void main(String[] args){

        if (args.length > 0) {
            System.out.println(args[0]);
            System.exit(0);

        }else {
            System.err.println("Error");
            System.exit(-1);
        }
    }
}