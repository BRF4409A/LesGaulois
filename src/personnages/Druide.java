package personnages;

import object.Potion;

public class Druide extends Gaulois{
	private Potion potion;
	
	public Druide(String nom, int force) {
		super(nom, force);
	}
	
	public void concocterPotion() {
		potion = new Potion();
		parler("J'ai concoct� " + potion.getDose() + " doses de potion magique. Elle a une force de " + potion.getForce());
	}
	
	public void distribuerPotion(Gaulois gaulois) {
		if (potion.getDose() > 0) {
			String obelix = "Obelix";
			if(obelix.equals(gaulois.getNom())) {
				parler("Non, " + gaulois.getNom() +" Non !... Et tu le sais tr�s bien !");
			}else {
				gaulois.boirePotion(potion.getForce());
				potion.boireDose();
				
				parler("Tiens " + gaulois.getNom() +" un peu de potion magique.");
			}
		}else {
			parler("D�sol� " + gaulois.getNom() +" il n'y a plus une seule goutte de potion.");
		}
		
	}

}
