package controller;

import java.util.ArrayList;

import model.réservation.Véhicule;

public class ControllerGeneral {
	
	public void EnregistrerReservation () {
		RecupererVéhicule véhic = new RecupererVéhicule();
		ArrayList<Véhicule> listVéhicul = new ArrayList<Véhicule>();
		listVéhicul = véhic.listVéhicule("véhicule.xml");
		
	}

}
