package Tema1.EjerciciosPDF;

/*
    PS C:\Users\tobia\IdeaProjects\PSP\src> javac Tema1\EjerciciosPDF\LeerNombre.java
    PS C:\Users\tobia\IdeaProjects\PSP\src> java Tema1.EjerciciosPDF.LeerNombre hola
   */

public class LeerNombre {
    public static void main(String[] args) {

        if (args.length > 0) {
            System.out.println(args[0]);
            System.exit(0);



        }else {
            System.err.println("Error");
            System.exit(-1);
        }

    }

}
