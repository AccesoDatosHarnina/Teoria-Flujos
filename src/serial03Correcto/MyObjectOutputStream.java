package serial03Correcto;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MyObjectOutputStream extends ObjectOutputStream {

	// hemos probado que con herencia no se puede modificar el orden
	// de ejecucion del constructor
	// probar con un componente no me deja acceder a metodos protected
	// no podemos respetar el principio de Liskov, lo que me da
	// que pensar que este sistema de almacenar varios objetos en un
	// único archivo no debe hacerse así

	public MyObjectOutputStream(OutputStream out) throws IOException {
		super(out);
	}

	@Override
	protected void writeStreamHeader() throws IOException {
	}

}
