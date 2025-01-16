package sites;

import personnages.Gaulois;
import personnages.Grade;

public class Village {
	private Gaulois chef;
	private Gaulois[] armeeGaulois = new Gaulois[50];
	private int nbGaulois;
	
	public Village(Gaulois chef) {
		this.chef = chef;
		nbGaulois = 0;
	}
	
	public Gaulois getCommandant() {
		return chef;
	}
	
	public void ajouterVillageois(Gaulois gaulois) {
		if (nbGaulois>=4) {
			chef.parler("Désolé " + gaulois.getNom() + "  mon village est déjà bien rempli.");
		}
		else {
			chef.parler("Bienvenue " + gaulois.getNom() + "  !");
			armeeGaulois[nbGaulois] =  gaulois;
			nbGaulois++;
		}
	}
	
	
}
