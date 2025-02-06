package personnages;

import objects.Equipement;

public class Soldat extends Romain {
	private Grade grade;
	private Equipement[] equipements = new Equipement[3];
	private int nbEquipement = 0;

	public Soldat(String nom, int force, Grade grade) {
		super(nom, force);
		this.grade = grade;
	}

	public Grade getGrade() {
		return grade;
	}

	public void ajouterEquipement(Equipement equipement) {
		boolean equipementPresent = false;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipement.equals(equipements[i]))
				equipementPresent = true;
		}
		if (equipementPresent) {
			System.out.println("Le " + getGrade() + " " + getNom() + " possède déjà un " + equipement.toString());
		} else {
			equipements[nbEquipement] = equipement;
			nbEquipement++;
			System.out.println("Le " + getGrade() + " " + getNom() + " s'équipe avec un " + equipement.toString());
		}
	}

	@Override
	public void recevoirCoup(int forceCoup) {
		int valeurEquipement = 0;
		for (int i = 0; i < nbEquipement; i++) {
			valeurEquipement = valeurEquipement + equipements[i].getValeurEquipement();
			System.out.println("Le " + equipements[i].toString() + " absorbe " + equipements[i].getValeurEquipement() + " du coup");
		}

		setForce(getForce() - (forceCoup - valeurEquipement));
		StringBuilder chaine = new StringBuilder("Le" + donnerAuteur() + getNom() + " : ");
		if (getForce() > 0) {
			chaine.append("\"Aïe\"");
		} else {
			setForce(0);
			chaine.append("\"J’abandonne…\"");
		}
		System.out.println(chaine);
	}
}
