package Tema1.EjerciciosRA1;

import java.io.IOException;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) throws IOException {
        ProcessBuilder pb = new ProcessBuilder("java", "-cp", ".", "Tema1.EjerciciosRA1.Ej4");

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Apagar");
        System.out.println("2. Reinciar");
        System.out.println("3. Suspender");
        int opcion = sc.nextInt();

        System.out.println("1. Linux");
        System.out.println("2. Windows");
        int os = sc.nextInt();

        System.out.println("¿Tiempo?");
        int time = sc.nextInt();

        try {
            if (os != 1 && os != 2) {
                System.out.println("Sistema operativo no encontrado");

            } else if (os == 1) {
                switch (opcion) {
                    case 1:
                        pb.command("sh", "-c", "shutdown -h +" + time);
                        break;
                    case 2:
                        pb.command("sh", "-c", "shutdown -r +" + time);
                        break;
                    case 3:
                        pb.command("sh", "-c", "systemctl suspend");
                }
            } else {
                switch (opcion) {
                    case 1:
                        pb.command("CMD", "/c", "shutdown /s /t " + time);
                        break;
                    case 2:
                        pb.command("CMD", "/c", "shutdown /r /t " + time);
                        break;
                    case 3:
                        pb.command("CMD", "/c", "shutdown /h" + time);
                        break;
                }
            }
            try {
                Process p = pb.start();
                int exitValue = p.waitFor();
                System.out.println(exitValue);
            } catch (IOException | InterruptedException e){
                e.printStackTrace();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
