package Hilos;

class HiloTic extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("TIC");
            try {
                Thread.sleep(500); // medio segundo para poder ver el texto
            } catch (InterruptedException e) {
                System.out.println("El hilo TIC fue interrumpido");
                break; // salimos del bucle si el hilo se interrumpe
            }
        }
    }
}

// Clase que imprime "TAC"
class HiloTac extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("TAC");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("El hilo TAC fue interrumpido");
                break;
            }
        }
    }
}

// Clase principal
public class TicTacMain {
    public static void main(String[] args) {
        HiloTic tic = new HiloTic();
        HiloTac tac = new HiloTac();

        // Iniciamos los hilos
        tic.start();
        tac.start();
    }
}