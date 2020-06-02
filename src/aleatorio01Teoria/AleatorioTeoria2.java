package aleatorio01Teoria;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class AleatorioTeoria2 {

	public static void main(String[] args) {
		RandomAccessFile flujoAccessFile = null;
		try {
			flujoAccessFile = new RandomAccessFile("aleTeoria.ale", "rw");
			System.out.println("el puntero esta en la posicion " + flujoAccessFile.getFilePointer());
			// Puedo manipular la posicion del puntero antes de escribir
			// queremos insertar al final
			long ultima = flujoAccessFile.length();
			// movernos hasta la posicion final
			flujoAccessFile.seek(ultima);
			for (int i = 0; i < 8; i++) {
				flujoAccessFile.writeChar('b');
			}
			System.out.println("el puntero esta en la posicion " + flujoAccessFile.getFilePointer());
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			flujoAccessFile.seek(0);
			for (int i = 0; i < 8; i++) {
				System.out.print(flujoAccessFile.readChar());
			}
			flujoAccessFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
