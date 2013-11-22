package productos.concretos;

import productos.abstractos.ASocket;

public class SocketVms implements ASocket {

	public SocketVms () {
		System.out.println(" CreateSocket ");
	}
	public void EstablecerConexion () {
		System.out.println("Estableciendo conexion ...");
		System.out.println("Conexion establecida");
	}
	public void FinalizarConexion () {
		System.out.println("Conexion finalizada");
	}

}
