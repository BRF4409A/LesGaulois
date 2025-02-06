package batailles;

import objects.Equipement;
import personnages.Druide;
import personnages.Gaulois;
import personnages.Soldat;
import personnages.Grade;

public class Embuscade implements Ibataille {
	private Gaulois[] compairses = new Gaulois[4];
	private Soldat[] soldats = new Soldat[2];

	@Override
	public void donnerContext() {
		System.out.println("Dans une sombre forêt dans un coin reculé de la Gaule, quatre comparses se promènent.");
	}
	
	private void creerGaulois() {
		compairses[0] = new Gaulois("Ordralfabétix", 1);
		compairses[1] = new Gaulois("Cétautomatix",2);
		compairses[2] = new Gaulois("Astérix", 5);
		compairses[3] = new Gaulois("Obélix", 15);
	}
	
	private void creerSoldats() {
		soldats[0] = new Soldat("Quintilius", 6, Grade.SOLDAT);
		soldats[1] = new Soldat("Minus", 6, Grade.SOLDAT);
	}

	@Override
	public void choisirCombattant() {
		System.out.println("Il y a plusieurs combatants : ");
		creerGaulois();
		creerSoldats();
		System.out.println("Il s'agit de " + compairses[0].getNom() + ", " + compairses[1].getNom() + ", " + compairses[2].getNom() + ", " + compairses[3].getNom() + ".");
		System.out.println("Mais cachés derrière des bosquets se cachent " + soldats[0].getNom() + " et " + soldats[1].getNom() + ".");
	}
	
	private void preparerGaulois(Druide druide) {
		druide.distribuerPotion(compairses[0]);
		druide.distribuerPotion(compairses[1]);
		druide.distribuerPotion(compairses[2]);
		druide.distribuerPotion(compairses[3]);
	}
	
	private void preparerSoldats() {
		soldats[0].ajouterEquipement(Equipement.CASQUE);
		soldats[0].ajouterEquipement(Equipement.BOUCLIER);
		soldats[0].ajouterEquipement(Equipement.PLASTRON);
		soldats[0].ajouterEquipement(Equipement.BOUCLIER);
		soldats[1].ajouterEquipement(Equipement.CASQUE);
		soldats[1].ajouterEquipement(Equipement.BOUCLIER);
		soldats[1].ajouterEquipement(Equipement.PLASTRON);
	}

	@Override
	public void preparerCombat() {
		Druide panoramix  = new Druide("Panoramix", 8);
		
		System.out.println("Lorsque qu'ils étaient encore dans leurs village, " + panoramix.getNom() + "leurs a donné de la potion dans leurs gourdes");
		panoramix.concocterPotion();
		preparerGaulois(panoramix);
		System.out.println(" ");
		
		System.out.println("Mais les romains aussi se sont bien équippé avant le partir !");
		preparerSoldats();
	}

	@Override
	public void decrireCombat() {
		soldats[1].parler("BOUH !!! On vous attaque !");
		
		while (!soldats[1].assomer() && !compairses[3].assomer()) {
			asterix.frapper(minus);
			if (!minus.assomer())
				minus.frapper(asterix);
		}
		System.out.println("Da");
	}

	@Override
	public void DonnerResultat() {
		System.out.println("Da");
	}

}
