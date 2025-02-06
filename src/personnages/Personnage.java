package personnages;

public abstract class Personnage {
	private String nom;
	private int force;

	protected Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	public int getForce() {
		return force;
	}
	
	public void setForce(int force) {
		this.force = force;
	}

	public void parler(String parole) {
		System.out.println("Le" + donnerAuteur() + nom + " : \"" + parole + "\".");
	}
	
	protected abstract String donnerAuteur();
	
	public void frapper(Personnage adversaire) {
		System.out.println("Le" + donnerAuteur() + nom + " donne un grand coup au" + adversaire.donnerAuteur() + adversaire.getNom() );
		adversaire.recevoirCoup(force/3);
	}
	
	public void recevoirCoup(int forceCoup) {
		force = force - forceCoup;
		StringBuilder chaine = new StringBuilder("Le" + donnerAuteur() + nom + " : ");
		if (force > 0) {
			chaine.append("\"Aïe\"");
		} else {
			force = 0;
			chaine.append("\"J’abandonne…\"");
		}
		System.out.println(chaine);
	}
	
	public boolean assomer() {
		return (force <= 0);	
	}
}
