package cliente;

import fabricas.abstractas.FabricaPlataformas;
import fabricas.concretas.FabricaVms;

public class Main {

	public static void main(String[] args) {
		FabricaPlataformas fabrica = new FabricaVms ();
		
		fabrica.createSocket();
		fabrica.createPipe();
		fabrica.createThread();
		
		System.out.println("main: complete");
	}

}
