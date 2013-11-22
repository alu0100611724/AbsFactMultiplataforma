package fabricas.concretas;

import productos.abstractos.*;
import productos.concretos.*;
import fabricas.abstractas.FabricaPlataformas;

public class FabricaUnix implements FabricaPlataformas {

	@Override
	public APipe createPipe() {
		System.out.print("UnixFactory:");
		return new PipeNt();
	}

	@Override
	public ASocket createSocket() {
		System.out.print("UnixFactory:");
		return new SocketNt();
	}

	@Override
	public AThread createThread() {
		System.out.print("UnixFactory:");
		return new ThreadNt();
	}

}
