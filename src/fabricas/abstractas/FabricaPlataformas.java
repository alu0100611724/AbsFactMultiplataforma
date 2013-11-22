package fabricas.abstractas;

import productos.abstractos.*;

public interface FabricaPlataformas {
	APipe createPipe();
	ASocket createSocket();
	AThread createThread();
}
