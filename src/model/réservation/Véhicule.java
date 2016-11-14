package model.réservation;


/**
 * 
 */
public class Véhicule {

    /**
     * Default constructor
     */
    public Véhicule() {
    }

    public int idVéhicule;
    public String Immatriculation;
    public String Marque;
    public String Type;
    public int Kilométrage;
    public boolean Disponibilité;
    public String Catégorie;
    public Location loc;

    public Véhicule(int idVéhicule, String immatriculation, String marque, String type, int kilométrage,
			boolean disponibilité, String catégorie, Location loc) {
		super();
		this.idVéhicule = idVéhicule;
		Immatriculation = immatriculation;
		Marque = marque;
		Type = type;
		Kilométrage = kilométrage;
		Disponibilité = disponibilité;
		Catégorie = catégorie;
		this.loc = loc;
	}
    
    public Véhicule(int idVéhicule, String immatriculation, String marque, String type, int kilométrage,
			boolean disponibilité) {
		super();
		this.idVéhicule = idVéhicule;
		Immatriculation = immatriculation;
		Marque = marque;
		Type = type;
		Kilométrage = kilométrage;
		Disponibilité = disponibilité;

	}

	public int getIdVéhicule() {
		return idVéhicule;
	}

	public void setIdVéhicule(int idVéhicule) {
		this.idVéhicule = idVéhicule;
	}

	public String getImmatriculation() {
		return Immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		Immatriculation = immatriculation;
	}

	public String getMarque() {
		return Marque;
	}

	public void setMarque(String marque) {
		Marque = marque;
	}

	public int getKilométrage() {
		return Kilométrage;
	}

	public void setKilométrage(int kilométrage) {
		Kilométrage = kilométrage;
	}

	public boolean isDisponibilité() {
		return Disponibilité;
	}

	public void setDisponibilité(boolean disponibilité) {
		Disponibilité = disponibilité;
	}

	public String getCatégorie() {
		return Catégorie;
	}

	public void setCatégorie(String catégorie) {
		Catégorie = catégorie;
	}

	@Override
	public String toString() {
		return "Véhicule [idVéhicule=" + idVéhicule + ", Immatriculation=" + Immatriculation + ", Marque=" + Marque
				+ ", Type=" + Type + ", Kilométrage=" + Kilométrage + ", Disponibilité=" + Disponibilité + "]";
	}

	/**
     * 
     */
    public void VérifierDisponibilité() {
        // TODO implement here
    }

}