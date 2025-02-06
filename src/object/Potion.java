package object;

import java.security.SecureRandom;

public class Potion {
	private int force;
	private int nbDose;
	private static final int FORCE_MIN = 2;
	private static final int FORCE_MAX = 4;
	private static final int DOSE_MIN = 1;
	private static final int DOSE_MAX = 3;
	
	private SecureRandom random = new SecureRandom();
	
	public Potion() {
		this.force = random.nextInt(FORCE_MIN,FORCE_MAX); 
		this.nbDose = random.nextInt(DOSE_MIN,DOSE_MAX);
		
		try {
			random = SecureRandom.getInstanceStrong();
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
	
	public int getForce() {
		return force;
	}
	
	public int getDose() {
		return nbDose;
	}
	
	public void boireDose() {
		nbDose --;
	}
}
