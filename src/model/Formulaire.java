package model;

public class Formulaire {
	protected int jour;
	protected int mois;
	private int IdentificationEntite;
	
	public Formulaire(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
	}

	public int getJour() {
		return jour;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public int getIdentificationEntite() {
		return IdentificationEntite;
	}

	public void setIdentificationEntite(int identificationEntite) {
		IdentificationEntite = identificationEntite;
	}
	
}
