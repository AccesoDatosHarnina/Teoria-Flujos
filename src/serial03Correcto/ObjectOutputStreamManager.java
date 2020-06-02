package serial03Correcto;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamManager {

	public ObjectOutputStream get(String name) throws IOException {
		boolean exists = new File(name).exists();
		FileOutputStream out = new FileOutputStream(name, true);
		if (exists) {
			return new MyObjectOutputStream(out);
		} else {
			return new ObjectOutputStream(out);
		}
	}
}
