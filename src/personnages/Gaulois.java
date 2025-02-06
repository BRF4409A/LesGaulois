package personnages;

public class Gaulois extends Personnage {
	private float forcePotion;
	
	public Gaulois(String nom, int force) {
		super(nom, force);
		forcePotion = 1;
	}

	@Override
	protected String donnerAuteur() {
		return " Gaulois ";
	}
	
	public void boirePotion(int potion) {
		forcePotion = potion;
	}
	
	@Override
	public void frapper(Personnage adversaire) {
		int coup = Math.round(getForce()*forcePotion);
		System.out.println("Le" + donnerAuteur() + getNom() + " donne un grand coup au" + adversaire.donnerAuteur() + adversaire.getNom() + " de force " + coup);
		adversaire.recevoirCoup(coup);
		forcePotion -= 0.5;
		if (forcePotion < 1)
			forcePotion = 1;
	}
}