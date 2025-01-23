package sites;

import personnages.Gaulois;

public class Village {
	private Gaulois chef;
	private Gaulois[] armeeGaulois = new Gaulois[50];
	private int nbGaulois = 0;

	public Village(Gaulois chef) {
		this.chef = chef;
		chef.parler("Je suis un grand guerrier et je vais cr�er mon village");
	}

	public Gaulois getCommandant() {
		return chef;
	}

	public void ajouterVillageois(Gaulois gaulois) {
		if (nbGaulois >= armeeGaulois.length - 1) {
			chef.parler("D�sol� " + gaulois.getNom() + " mon village est d�j� bien rempli.");
		} else {
			chef.parler("Bienvenue " + gaulois.getNom() + "  !");
			armeeGaulois[nbGaulois] = gaulois;
			nbGaulois++;
		}
	}

	public void afficherVillage() {
		System.out.println("Le village de " + chef.getNom() + " est habit� par :");
		for (int i = 0; i < nbGaulois; i++) {
			System.out.println("- " + armeeGaulois[i].getNom());
		}
	}

	public void changerChef(Gaulois newChef, boolean reste) {
		Gaulois ancienChef = chef;
		chef.parler(" Je laisse mon grand bouclier au grand" + newChef.getNom());
		chef = newChef;
		chef.parler(" Merci ! ");

		if (reste) {
			ajouterVillageois(ancienChef);
		}

	}
}
