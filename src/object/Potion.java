package object;

public class Potion {
	private int force;
	private int nbDose;
	
	public Potion(int force, int nbDose) {
		this.force = force;
		this.nbDose = nbDose;
	}
	
	public int getForce() {
		return force;
	}
	
	public int getDose() {
		return nbDose;
	}
}
