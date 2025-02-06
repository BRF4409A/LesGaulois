package test_fonctionnel;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Grade;
import personnages.Soldat;
import object.Equipement;

public class TestGaulois {
	public static void main(String[] args) {
		Druide panoramix  = new Druide("Panoramix", 8);
		panoramix.concocterPotion();
		
		Gaulois agecanonix = new Gaulois("Agecanonix", 1);
		Gaulois assurancetourix = new Gaulois("Assurancetourix", 1);
		Gaulois abraracourcix = new Gaulois("Abraracourcix",2);
		Gaulois asterix = new Gaulois("Asterix", 5);
		Gaulois obelix = new Gaulois("Obelix", 15);
		
		panoramix.distribuerPotion(asterix);
		panoramix.distribuerPotion(obelix);
		panoramix.distribuerPotion(assurancetourix);
		panoramix.distribuerPotion(abraracourcix);
		panoramix.distribuerPotion(agecanonix);
		
		System.out.println(" ");System.out.println(" ");System.out.println(" ");
		
		Soldat minus = new Soldat("Minus", 6, Grade.SOLDAT);
		minus.ajouterEquipement(Equipement.CASQUE);
		minus.ajouterEquipement(Equipement.BOUCLIER);
		minus.ajouterEquipement(Equipement.PLASTRON);
		minus.ajouterEquipement(Equipement.BOUCLIER);
		
		System.out.println(" ");
		
		asterix.parler("Bonjour à tous");
		minus.parler("UN GAU... UN GAUGAU...");
		
		while (!minus.assomer() && !asterix.assomer()) {
			asterix.frapper(minus);
			if (!minus.assomer())
				minus.frapper(asterix);
		}
		
		System.out.println(" ");System.out.println(" ");System.out.println(" ");
		
		Soldat brutus = new Soldat("Brutus", 5, Grade.CENTURION);
		brutus.ajouterEquipement(Equipement.CASQUE);
		brutus.ajouterEquipement(Equipement.BOUCLIER);
		brutus.ajouterEquipement(Equipement.PLASTRON);
		brutus.ajouterEquipement(Equipement.BOUCLIER);
		
		
		
		
	}
}