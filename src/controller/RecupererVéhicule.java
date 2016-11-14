package controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import model.réservation.Véhicule;
import xml.Decode;

public class RecupererVéhicule {

	public static ArrayList<Véhicule> listVéhicule(String nomFichier) {
		Decode decode = new Decode();
		ArrayList<Véhicule> listvehic = new ArrayList<Véhicule>();
		try {
			listvehic = (ArrayList<Véhicule>) decode.decode(nomFichier);
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
