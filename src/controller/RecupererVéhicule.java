package controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import model.r�servation.V�hicule;
import xml.Decode;

public class RecupererV�hicule {

	public static ArrayList<V�hicule> listV�hicule(String nomFichier) {
		Decode decode = new Decode();
		ArrayList<V�hicule> listvehic = new ArrayList<V�hicule>();
		try {
			listvehic = (ArrayList<V�hicule>) decode.decode(nomFichier);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listvehic;
	}



}
