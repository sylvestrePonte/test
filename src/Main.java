import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import model.r�servation.V�hicule;
import vue.VueEnregisterLocation;
import xml.Encode;

public class Main {

	public static void main (String [] args) {
		/*
		Encode encode = new Encode();
		V�hicule v1 = new V�hicule(1, "AAA", "Renault", "Utilitaire", 150000, true);
		V�hicule v2 = new V�hicule(2, "BBB", "BMW", "Citadine", 25000, true);	
		V�hicule v3 = new V�hicule(3, "CCC", "Peugeot", "Citadine", 350000, false);
		V�hicule v4 = new V�hicule(4, "DDD", "Mercedes", "Utilitaire", 7500000, true);
		V�hicule v5 = new V�hicule(5, "EEE", "Audi", "Berline", 600, true);
		
		ArrayList<V�hicule> listv�hic= new ArrayList<V�hicule>();
		listv�hic.add(v1);
		listv�hic.add(v2);
		listv�hic.add(v3);
		listv�hic.add(v4);
		listv�hic.add(v5);
		
		
		try {
			encode.encode(listv�hic, "vehicule.xml");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
*/
		new VueEnregisterLocation();
	}

		

}
