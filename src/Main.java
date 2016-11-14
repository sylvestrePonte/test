import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import model.réservation.Véhicule;
import vue.VueEnregisterLocation;
import xml.Encode;

public class Main {

	public static void main (String [] args) {
		/*
		Encode encode = new Encode();
		Véhicule v1 = new Véhicule(1, "AAA", "Renault", "Utilitaire", 150000, true);
		Véhicule v2 = new Véhicule(2, "BBB", "BMW", "Citadine", 25000, true);	
		Véhicule v3 = new Véhicule(3, "CCC", "Peugeot", "Citadine", 350000, false);
		Véhicule v4 = new Véhicule(4, "DDD", "Mercedes", "Utilitaire", 7500000, true);
		Véhicule v5 = new Véhicule(5, "EEE", "Audi", "Berline", 600, true);
		
		ArrayList<Véhicule> listvéhic= new ArrayList<Véhicule>();
		listvéhic.add(v1);
		listvéhic.add(v2);
		listvéhic.add(v3);
		listvéhic.add(v4);
		listvéhic.add(v5);
		
		
		try {
			encode.encode(listvéhic, "vehicule.xml");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
*/
		new VueEnregisterLocation();
	}

		

}
