package fabricas.concretas;

import productos.abstractos.*;
import productos.concretos.*;
import fabricas.abstractas.FabricaPlataformas;

public class FabricaVms implements FabricaPlataformas {

	@Override
	public APipe createPipe() {
		System.out.print("NtFactory:");
		return new PipeNt();
	}

	@Override
	public ASocket createSocket() {
		System.out.print("NtFactory:");
		return new SocketNt();
	}

	@Override
	public AThread createThread() {
		System.out.print("NtFactory:");
		return new ThreadNt();
	}

}
