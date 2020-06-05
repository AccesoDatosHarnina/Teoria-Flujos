package aleatorio02Objetos;

import java.io.IOException;
import java.io.RandomAccessFile;

public class GrabadorRandom {
	RandomAccessFile fileRandom;

	// voy a grabar los elementos uno tras otro
	// los objetos secuencialmente
	// Los objetos pueden ser de tamano diferente
	Cliente unoCliente = new Cliente(1, "luis", true, 0);
	Cliente dosCliente = new Cliente(1, "paco", true, 520000);
	// los dos anteriores objetos tienen el mismo tamano
	// pero el tercero es más grande
	Cliente tercerCliente = new Cliente(1, "Francisco", true, 520000);

	// si los grabo uno tras otro: como se donde empieza uno y acaba
	// en un fichero en el que solo hay un tren de bytes?
	public GrabadorRandom() throws IOException {
		super();
		// poner el puntero en la posicion necesaria para leer el primer objeto
		fileRandom.seek(0);
		fileRandom.readInt();
		fileRandom.readUTF();
		fileRandom.readBoolean();
		fileRandom.readFloat();
		// despues de leer todos los campos del primer objeto
		// el puntero del fichero esta ahora en el primer byte
		// del siguiente objeto
		// Para recuperar y grabar todos los objetos de un fichero con acceso aleatorio
		// no hay problema
		// El problema que veremos el Lunes es aprovechar la caracteristica aleatoria
		// del flujo. Es decir, poder ir al objeto que se me antoje sin pasar por los
		// anteriores
	}

}
