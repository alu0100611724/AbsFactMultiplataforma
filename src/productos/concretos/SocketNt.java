package productos.concretos;

import productos.abstractos.ASocket;

public class SocketNt implements ASocket {

	public SocketNt () {
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
