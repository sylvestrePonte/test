package model.utilisateur;

import java.util.*;

import model.réservation.Location;

/**
 * 
 */
public class Utilisateur {


    public Utilisateur() {
    }

    public int idUtilisateur;
    public String login;
    public String password;
    public List<Location> loc;
	public Utilisateur(int idUtilisateur, String login, String password, List<Location> loc) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.login = login;
		this.password = password;
		this.loc = loc;
	}

}