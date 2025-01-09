package personnages;

public class Gaulois {
	private String nom;
	private int force;
	
	public Gaulois(String nom, int force){
		this.nom = nom;
		this.force = force;
	}
	
	private String getNom() {
		return nom;
	}
}