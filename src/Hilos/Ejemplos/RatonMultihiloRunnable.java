package Hilos.Ejemplos;

public class RatonMultihiloRunnable implements Runnable {
	
	private String nombre;
	private int tiempoAlimentacion;
	
	

	public RatonMultihiloRunnable(String nombre, int tiempoAlimentacion) {
		super();
		this.nombre = nombre;
		this.tiempoAlimentacion = tiempoAlimentacion;
	}
	
	public void comer() {
		
		try {
			
			System.out.println("El raton "+ nombre +" ha comenzado a alimentarse");
			Thread.sleep(tiempoAlimentacion*1000);
			System.out.println("El raton "+nombre+" ha terminado de alimentarse");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void run() {
		this.comer();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RatonMultihiloRunnable fievel=new RatonMultihiloRunnable("Fievel",4);
		RatonMultihiloRunnable jerry=new RatonMultihiloRunnable("Jerry",5);
		RatonMultihiloRunnable pinky=new RatonMultihiloRunnable("Pinky",3);
		RatonMultihiloRunnable mickey=new RatonMultihiloRunnable("Mickey",6);
		new Thread(fievel).start();
		new Thread(jerry).start();
		new Thread(pinky).start();
		new Thread(mickey).start();
	}

}
