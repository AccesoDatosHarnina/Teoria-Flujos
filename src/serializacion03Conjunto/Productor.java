package serializacion03Conjunto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import serializacion01.Cliente;

public class Productor {
	public static void main(String[] args) {
//		Cliente cliente = new Cliente(1, "donald", true, 10000000f);
		Cliente cliente = new Cliente(2, "ulises", true, 10000000f);
		String name = "clientes.dat";
		ObjectOutputStream serializador = null;
		try {
			if (!new File(name).exists()) {
				serializador = new MyObjectOutputStream(new FileOutputStream(name, true));
			}else {
				serializador = new ObjectOutputStream(new FileOutputStream(name, true));
			}
			serializador.writeObject(cliente);
			System.out.println("todo bien");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
