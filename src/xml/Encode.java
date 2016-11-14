package xml;

import java.beans.XMLEncoder;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Encode {

	public static void encode(Object object, String nomFichier) throws FileNotFoundException {
		XMLEncoder encoder = new XMLEncoder(new FileOutputStream(nomFichier));
		try {
			encoder.writeObject(object);
			encoder.flush();
		}

		finally {
			encoder.close();
		}
	}

}
