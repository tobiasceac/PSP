package Hilos.Ejemplos;

public class Raton {
	
	private String nombre;
	private int tiempoAlimentacion;
	
	
	public Raton(String nombre, int tiempoAlimentacion) {
		super();
		this.nombre = nombre;
		this.tiempoAlimentacion = tiempoAlimentacion;
	}
	
	public void comer() {
		
		try {
			
			System.out.println("El rat�n "+ nombre +" ha comenzado a alimentarse");
			Thread.sleep(tiempoAlimentacion*1000);
			System.out.println("El rat�n "+nombre+" ha terminado de alimentarse");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Raton fievel=new Raton("Fievel",4);
		Raton jerry=new Raton("Jerry",5);
		Raton pinky=new Raton("Pinky",3);
		Raton mickey=new Raton("Mickey",6);
		fievel.comer();
		jerry.comer();
		pinky.comer();
		mickey.comer();
	}

}
