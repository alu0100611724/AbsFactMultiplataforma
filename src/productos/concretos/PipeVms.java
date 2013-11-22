package productos.concretos;

import productos.abstractos.APipe;

public class PipeVms implements APipe {
	
	public PipeVms () {
		System.out.println(" CreatePipe ");
	}
	
	@Override
	public void inicioTuberia () {
		System.out.println(" Tuberia Iniciada ");
	}
	@Override
	public void finTuberia() {
		System.out.println(" Tuberia Cerrada ");
	}

}
