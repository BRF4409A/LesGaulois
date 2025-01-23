package personnages;

import object.Potion;
import java.security.SecureRandom;

public class Druide extends Gaulois{
	private int forceMin = 2;
	private int forceMax = 6;
	private int doseMin = 1;
	private int doseMax = 3;
	Potion potion;
	
	private SecureRandom random = new SecureRandom();
	
	public Druide(String nom, int force) {
		super(nom, force);
		try {
			random = SecureRandom.getInstanceStrong();
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
	
	public void concocterPotion() {
		potion = new Potion(random.nextInt(forceMin,forceMax), random.nextInt(doseMin,doseMax));
		parler("J'ai concocté " + potion.getDose() + " doses de potion magique. Elle a une force de " + potion.getForce());
	}
	
	public void distribuerPotion(Gaulois gaulois) {
		if (potion.getDose() > 0) {
			parler("Désolé " + gaulois.getNom() +" il n'y a plus une seule goutte de potion.")
		}
	}

}
