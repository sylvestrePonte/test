package xml;

import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Decode {

	public static Object decode(String nomFichier) throws FileNotFoundException, IOException {
		Object object = null;
		XMLDecoder decoder = new XMLDecoder (new FileInputStream(nomFichier));
		try {
			object = decoder.readObject();
		}
		finally {
			decoder.close();
		}
		return object;
	}

}
