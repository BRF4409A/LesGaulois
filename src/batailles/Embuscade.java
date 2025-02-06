package batailles;

import java.security.SecureRandom;

import objects.Equipement;
import personnages.Druide;
import personnages.Gaulois;
import personnages.Soldat;
import personnages.Grade;

public class Embuscade implements Ibataille {
	private Gaulois[] compaires = new Gaulois[4];
	private Soldat[] soldats = new Soldat[2];
	
	private SecureRandom random = new SecureRandom();
	
	public Embuscade() {
		try {
			random = SecureRandom.getInstanceStrong();
		} catch (Exception e) {
		e.printStackTrace();
		}
	}

	@Override
	public void donnerContext() {
		System.out.println("Dans une sombre forêt dans un coin reculé de la Gaule, quatre comparses se promènent.");
	}
	
	private void creerGaulois() {
		compaires[0] = new Gaulois("Ordralfabétix", 8);
		compaires[1] = new Gaulois("Cétautomatix",8);
		compaires[2] = new Gaulois("Astérix", 5);
		compaires[3] = new Gaulois("Obélix", 15);
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
		System.out.println("Il s'agit de " + compaires[0].getNom() + ", " + compaires[1].getNom() + ", " + compaires[2].getNom() + ", " + compaires[3].getNom() + ".");
		System.out.println("Mais cachés derrière des bosquets se cachent " + soldats[0].getNom() + " et " + soldats[1].getNom() + ".");
	}
	
	private void preparerGaulois(Druide druide) {
		druide.distribuerPotion(compaires[0]);
		druide.distribuerPotion(compaires[1]);
		druide.distribuerPotion(compaires[2]);
		druide.distribuerPotion(compaires[3]);
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
		
		System.out.println("Mais les romains aussi se sont bien équippé avant de partir !");
		preparerSoldats();
	}
	
	private boolean assomerCompaires() {
		return (compaires[0].assomer() && compaires[1].assomer() && compaires[2].assomer() && compaires[3].assomer());
	}
	
	private boolean assomerSoldats() {
		return (soldats[0].assomer() && soldats[1].assomer());
	}
	
	private int selectionnerCombattant(int max, String auteur) {
		int idex;
		boolean verifAssomer = false;
		
		do {
			idex = random.nextInt(0, max);
			
			if (auteur.equals(compaires[idex].donnerAuteur())) {
				verifAssomer = compaires[idex].assomer();
			}else {
				verifAssomer = soldats[idex].assomer();
			}
		}while(verifAssomer);
		
		return idex;
	}

	@Override
	public void decrireCombat() {
		soldats[1].parler("BOUH !!! On vous attaque !");
		compaires[3].parler("Avec plaisir !!!");
		System.out.println(" ");
		int iCompaire;
		int iSoldat;
		do {
			iCompaire = selectionnerCombattant(3,compaires[0].donnerAuteur());
			iSoldat = selectionnerCombattant(1,soldats[0].donnerAuteur());
			
			compaires[iCompaire].frapper(soldats[iSoldat]);
			if (!soldats[iSoldat].assomer())
				soldats[iSoldat].frapper(compaires[iCompaire]);
			System.out.println(" SORTIE ? " + (!assomerCompaires() || !assomerSoldats()));
		} 
		//while (!assomerCompaires() || !assomerSoldats());
		while(false);
		System.out.println("AAAAAAAAAAAAAA_decrireCombat");
	}

	@Override
	public void donnerResultat() {
		if (assomerSoldats()) {
			System.out.println("Malgré cette sournoise attaque, nos promeneurs s'en sont sortis indemnes.");
			System.out.println("Ils pouvaient compter sur la force de Cétautomatix, Obelix et Astérix.");
		}else {
			System.out.println("L'attaque fut tellement rapide et inattendue que nos malheureux gaulois n'ont pas eu le temps de réagir.");
			System.out.println("Ils furent ligotés et emmenés dans le camp de Chorus.");
		}
	}

}
