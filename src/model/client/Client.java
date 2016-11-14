package model.client;


import model.réservation.Location;

/**
 * 
 */
public class Client {

    public Client() {
    }

    public int idClient;
    public String Nom;
    public String Prenom;
    public int Age;
    public String Adresse;
    public Location loc;
	public Client(int idClient, String nom, String prenom, int age, String adresse, Location loc) {
		super();
		this.idClient = idClient;
		Nom = nom;
		Prenom = prenom;
		Age = age;
		Adresse = adresse;
		this.loc = loc;
	}

}