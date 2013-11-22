package productos.concretos;

import productos.abstractos.APipe;

public class PipeNt implements APipe {
	
	public PipeNt () {
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
