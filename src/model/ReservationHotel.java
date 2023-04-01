package model;

public class ReservationHotel extends Reservation{
	private int nbLitSimple;
	private int nbLitDouble;
	private int numChambre;
	
	public ReservationHotel(int jour, int mois,int nbLitSimple, int nbLitDouble, int nunChambre) {
		super(jour, mois);
		this.nbLitDouble = nbLitDouble;
		this.nbLitSimple = nbLitSimple;
		this.numChambre = numChambre;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("Le " + this.jour + "/" + this.mois + " : chambre n°" + this.numChambre);
		str.append(" avec " + nbLitSimple + " lit(s) simple(s) et " + this.nbLitDouble +" lit(s) double(s)");
		return  str.toString() ;
	}
	
}
