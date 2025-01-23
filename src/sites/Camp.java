package sites;

import personnages.Grade;
import personnages.Soldat;

public class Camp {
	private Soldat commandant;
	private Soldat[] armeeSoldats = new Soldat[80];
	private int nbSoldat = 0;

	public Camp(Soldat commandant) {
		this.commandant = commandant;
		commandant.parler("Je suis en charge de créer un nouveau camp romain");
	}

	public Soldat getCommandant() {
		return commandant;
	}

	public void ajouterSoldat(Soldat soldat) {
		if (nbSoldat >= armeeSoldats.length - 1) {
			commandant.parler("Désolé " + soldat.getNom() + " notre camp est complet !");
		} else {
			soldat.parler("Je mets mon épée au service de Rome dans le camp dirigé par " + commandant.getNom());
			armeeSoldats[nbSoldat] = soldat;
			nbSoldat++;
		}
	}

	public void afficherCamp() {
		System.out.println("Le camp dirigé par " + commandant.getNom() + " contient les soldats :");
		for (int i = 0; i < nbSoldat; i++) {
			System.out.println("- " + armeeSoldats[i].getNom());
		}
	}

	public void changerCommandant(Soldat newCommandant, boolean reste) {
		Soldat ancienCommandant = commandant;

		if (newCommandant.getGrade() == Grade.CENTURION) {
			commandant = newCommandant;
			commandant.parler("Moi " + commandant.getNom() + " je prends la direction du camp romain. ");

			if (reste) {
				ajouterSoldat(ancienCommandant);
			}
		} else {
			newCommandant.parler("Je ne suis pas suffisamment gradé pour prendre la direction du camp romain. ");
		}
	}
}
