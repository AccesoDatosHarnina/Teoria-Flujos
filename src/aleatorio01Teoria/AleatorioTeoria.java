package aleatorio01Teoria;

import java.io.IOException;
import java.io.RandomAccessFile;

public class AleatorioTeoria {

	public static void main(String[] args) {
		try {
			RandomAccessFile flujoAccessFile = new RandomAccessFile("aleTeoria.ale", "rw");
			System.out.println("el puntero esta en la posicion " + flujoAccessFile.getFilePointer());
			// Puedo manipular la posicion del puntero antes de escribir
			// queremos insertar al final
			long ultima = flujoAccessFile.length();
			// movernos hasta la posicion final
			flujoAccessFile.seek(ultima);
			for (int i = 0; i < 8; i++) {
				flujoAccessFile.writeChar('h');
			}
			System.out.println("el puntero esta en la posicion " + flujoAccessFile.getFilePointer());
			flujoAccessFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			RandomAccessFile flujoAccessFile = new RandomAccessFile("aleTeoria.ale", "r");
			for (int i = 0; i < 8; i++) {
				System.out.print(flujoAccessFile.readChar());
			}
			flujoAccessFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
