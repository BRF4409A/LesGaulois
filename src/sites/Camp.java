package sites;


import personnages.Grade;
import personnages.Soldat;

public class Camp {
	private Soldat commandant;
	private Soldat[] armeeSoldats = new Soldat[80];
	private int nbSoldat;
	
	public Camp(Soldat commandant) {
		this.commandant = commandant;
		nbSoldat = 0;
	}
	
	public Soldat getCommandant() {
		return commandant;
	}
	
	public void ajouterSoldat(Soldat soldat) {
		if (nbSoldat>=3) {
			commandant.parler("Désolé " + soldat.getNom() + " notre camp est complet !");
		}
		else {
			commandant.parler("Je mets mon épée au service de Rome dans le camp dirigé par " + commandant.getNom());
			armeeSoldats[nbSoldat] =  soldat;
			nbSoldat++;
		}
	}
}
