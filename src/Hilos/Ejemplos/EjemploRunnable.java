
public class EjemploRunnable implements Runnable{
	public void run() {
		System.out.println("Hola desde el Hilo! "+Thread.currentThread().getId());
	}

}
