package model;

public class ReservationSpectacle extends Reservation{
	private int numZone;
	private int numChaise;
	
	public ReservationSpectacle(int jour, int mois,int numZone, int numChaise) {
		super(jour, mois);
		this.numChaise = numChaise;
		this.numZone = numZone;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		
		str.append("Le " + this.jour + "/" + this.mois + " : zone n°" + this.numZone);
		str.append(" et chaise n°" + this.numChaise);
		return  str.toString() ;
	}
}
