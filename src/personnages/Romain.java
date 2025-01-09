package personnages;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String parole) {
		System.out.println("Le Romain " + nom + " : \"" + parole + "\".");
	}

	public void recevoirCoup(int forceCoup) {
		force = force - forceCoup;
		if (force > 0) {
			System.out.println("Aïe!");
		} else {
			force = 0;
			System.out.println("J’abandonne…");
		}
	}
}
