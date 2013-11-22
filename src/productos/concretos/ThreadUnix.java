package productos.concretos;

import productos.abstractos.AThread;

public class ThreadUnix implements AThread {

	public ThreadUnix() {
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
