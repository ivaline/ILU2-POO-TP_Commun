package model;

public class FormulaireHotel extends Formulaire{
	private int NombrePersonnes;
	private int NumService;
	
	public FormulaireHotel(int jour, int mois, int NombrePersonnes, int NumService) {
		super(jour,mois);
		this.NombrePersonnes = NombrePersonnes;
		this.NumService = NumService;
	}
}
