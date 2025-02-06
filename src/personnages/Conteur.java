package personnages;

import batailles.Ibataille;
import batailles.Embuscade;

public class Conteur {
	String nom;
	Ibataille bataille;
	
	public Conteur(String nom) {
		this.nom = nom;
	}
	
	public void presenter(String parole) {
		System.out.println(parole);
	}
	
	public void lireHistoire() {
		bataille = new Embuscade();
		bataille.donnerContext();
		
		System.out.println(" ");
		bataille.choisirCombattant();
		
		System.out.println(" ");
		bataille.preparerCombat();
		
		System.out.println(" ");
		bataille.decrireCombat();
		
		System.out.println(" ");
		bataille.donnerResultat();
	}
}
