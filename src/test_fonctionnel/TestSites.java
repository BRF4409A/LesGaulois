package test_fonctionnel;

import personnages.Gaulois;
import personnages.Soldat;
import sites.Village;
import sites.Camp;
import personnages.Grade;


public class TestSites {

	public static void main(String[] args) {
		Gaulois vercingetorix = new Gaulois("Vercingetorix", 5);
		Village village = new Village(vercingetorix);
		Soldat minus = new Soldat("Minus", 2, Grade.SOLDAT);
		Camp camp = new Camp(minus);
		
		Gaulois agecanonix = new Gaulois("Agecanonix", 1);
		Gaulois assurancetourix = new Gaulois("Assurancetourix",2);
		Gaulois asterix = new Gaulois("Asterix", 5);
		Gaulois obelix = new Gaulois("Obelix", 15);
		Gaulois prolix = new Gaulois("Prolix", 5);
		
		Soldat brutus = new Soldat("Brutus", 5, Grade.CENTURION);
		Soldat milexcus = new Soldat("Milexcus", 2, Grade.SOLDAT);
		Soldat tullisOctopus = new Soldat("Tullis Octopus", 2, Grade.TESSERARIUS);
		Soldat ballondebaudrus = new Soldat("Ballondebaudrus", 3, Grade.OPTIO);
		
		camp.ajouterSoldat(brutus);
		camp.ajouterSoldat(milexcus);
		camp.ajouterSoldat(tullisOctopus);
		camp.ajouterSoldat(ballondebaudrus);
		
		System.out.println(" ");
		
		village.ajouterVillageois(agecanonix);
		village.ajouterVillageois(assurancetourix);
		village.ajouterVillageois(asterix);
		village.ajouterVillageois(obelix);
		village.ajouterVillageois(prolix);
		
		System.out.println(" ");
		
		village.afficherVillage();
		camp.afficherCamp();
		
		System.out.println(" ");
		
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 5);
		Soldat briseradius = new Soldat("Briseradius", 4, Grade.SOLDAT);
		Soldat chorus = new Soldat("Chorus", 4, Grade.CENTURION);
		
		village.changerChef(abraracourcix, true);
		camp.changerCommandant(briseradius, false);
		camp.changerCommandant(chorus, false);
		
		
		
		
	}
}
