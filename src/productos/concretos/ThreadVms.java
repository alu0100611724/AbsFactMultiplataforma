package productos.concretos;

import productos.abstractos.AThread;

public class ThreadVms implements AThread {

	public ThreadVms() {
		System.out.println(" CreateThread ");
	}
	
	public void Interrumpir() {
		System.out.println("Hilo interrumpido");
	}
	public void Ejecutar() {
		System.out.println("Hilo en ejecucion");
	}
	public void Dormir() {
		System.out.println("Hilo dormido");
	}
}
