package objects;

public enum Equipement {
	BOUCLIER("bouclier", 3), CASQUE("casque", 2), PLASTRON("plastron", 3);
	
	private String nomEquipement;
	private int valeurEquipement;
	
	private Equipement(String nomEquipement, int valeurEquipement) {
		this.nomEquipement = nomEquipement;
		this.valeurEquipement = valeurEquipement;
	}
	
	@Override
	public String toString() {
		return nomEquipement;
	}
	
	public int getValeurEquipement() {
		return valeurEquipement;
	}
}
