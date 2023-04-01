package model;

public class ReservationRestaurant extends Reservation {
	private int nbService;
	private int nbTable;
	
	public ReservationRestaurant(int jour, int mois, int nbService, int nbTable) {
		super(jour,mois);
		this.nbService = nbService;
		this.nbTable = nbTable;
	}
	
	@Override
	public String toString() {
		String service;
		if (nbService==1) {
			service = "premier service.\n";
		}
		else 
			service = "deuxiéme service.\n";
		String str;
		str = "Le " + this.jour + "/";
		str+=this.mois + " : table n°" + this.nbTable + " pour le " + service;
		return  str ;
	}
}
