package Hilos.Ejemplos;

public class RatonMultihilo extends Thread {
	
	private String nombre;
	private int tiempoAlimentacion;
	
	

	public RatonMultihilo(String nombre, int tiempoAlimentacion) {
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

		RatonMultihilo fievel=new RatonMultihilo("Fievel",4);
		RatonMultihilo jerry=new RatonMultihilo("Jerry",5);
		RatonMultihilo pinky=new RatonMultihilo("Pinky",3);
		RatonMultihilo mickey=new RatonMultihilo("Mickey",6);
		fievel.start();
		jerry.start();
		pinky.start();
		mickey.start();
	}

}
