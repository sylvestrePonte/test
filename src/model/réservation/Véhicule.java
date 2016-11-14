package model.r�servation;


/**
 * 
 */
public class V�hicule {

    /**
     * Default constructor
     */
    public V�hicule() {
    }

    public int idV�hicule;
    public String Immatriculation;
    public String Marque;
    public String Type;
    public int Kilom�trage;
    public boolean Disponibilit�;
    public String Cat�gorie;
    public Location loc;

    public V�hicule(int idV�hicule, String immatriculation, String marque, String type, int kilom�trage,
			boolean disponibilit�, String cat�gorie, Location loc) {
		super();
		this.idV�hicule = idV�hicule;
		Immatriculation = immatriculation;
		Marque = marque;
		Type = type;
		Kilom�trage = kilom�trage;
		Disponibilit� = disponibilit�;
		Cat�gorie = cat�gorie;
		this.loc = loc;
	}
    
    public V�hicule(int idV�hicule, String immatriculation, String marque, String type, int kilom�trage,
			boolean disponibilit�) {
		super();
		this.idV�hicule = idV�hicule;
		Immatriculation = immatriculation;
		Marque = marque;
		Type = type;
		Kilom�trage = kilom�trage;
		Disponibilit� = disponibilit�;

	}

	public int getIdV�hicule() {
		return idV�hicule;
	}

	public void setIdV�hicule(int idV�hicule) {
		this.idV�hicule = idV�hicule;
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

	public int getKilom�trage() {
		return Kilom�trage;
	}

	public void setKilom�trage(int kilom�trage) {
		Kilom�trage = kilom�trage;
	}

	public boolean isDisponibilit�() {
		return Disponibilit�;
	}

	public void setDisponibilit�(boolean disponibilit�) {
		Disponibilit� = disponibilit�;
	}

	public String getCat�gorie() {
		return Cat�gorie;
	}

	public void setCat�gorie(String cat�gorie) {
		Cat�gorie = cat�gorie;
	}

	@Override
	public String toString() {
		return "V�hicule [idV�hicule=" + idV�hicule + ", Immatriculation=" + Immatriculation + ", Marque=" + Marque
				+ ", Type=" + Type + ", Kilom�trage=" + Kilom�trage + ", Disponibilit�=" + Disponibilit� + "]";
	}

	/**
     * 
     */
    public void V�rifierDisponibilit�() {
        // TODO implement here
    }

}