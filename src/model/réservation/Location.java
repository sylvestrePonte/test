package model.r�servation;

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
    public V�hicule v�hi;
	public Location(int idLocation, Date dateDebut, Date dateFin, Utilisateur user, List<Client> cli, V�hicule v�hi) {
		super();
		this.idLocation = idLocation;
		DateDebut = dateDebut;
		DateFin = dateFin;
		this.user = user;
		this.cli = cli;
		this.v�hi = v�hi;
	}

}