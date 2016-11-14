package model.réservation;

import java.util.*;

import model.client.Client;
import model.utilisateur.Utilisateur;


public class Location {

    public Location() {
    }

    public int idLocation;
    public Date DateDebut;
    public Date DateFin;
    public Utilisateur user;
    public List<Client> cli;
    public Véhicule véhi;
	public Location(int idLocation, Date dateDebut, Date dateFin, Utilisateur user, List<Client> cli, Véhicule véhi) {
		super();
		this.idLocation = idLocation;
		DateDebut = dateDebut;
		DateFin = dateFin;
		this.user = user;
		this.cli = cli;
		this.véhi = véhi;
	}

}