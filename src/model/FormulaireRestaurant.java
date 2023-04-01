package model;

public class FormulaireRestaurant extends Formulaire{
	private int NombrePersonnes;
	private int NumService;
	
	public FormulaireRestaurant(int jour, int mois, int NombrePersonnes, int NumService) {
		super(jour,mois);
		this.NombrePersonnes = NombrePersonnes;
		this.NumService = NumService;
	}

	public int getNombrePersonnes() {
		return NombrePersonnes;
	}

	public void setNombrePersonnes(int nombrePersonnes) {
		NombrePersonnes = nombrePersonnes;
	}

	public int getNumService() {
		return NumService;
	}

	public void setNumService(int numService) {
		NumService = numService;
	}
}
