package controller;

import java.util.ArrayList;

import model.r�servation.V�hicule;

public class ControllerGeneral {
	
	public void EnregistrerReservation () {
		RecupererV�hicule v�hic = new RecupererV�hicule();
		ArrayList<V�hicule> listV�hicul = new ArrayList<V�hicule>();
		listV�hicul = v�hic.listV�hicule("v�hicule.xml");
		
	}

}
