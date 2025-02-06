package test_fonctionnel;

import personnages.Conteur;

public class TestBataille {
	public static void main(String[] args) {
		Conteur goscinny  = new Conteur("Goscinny");
		goscinny.presenter("Je suis Goscinny. Je vais vous conter une histoire qui se déroule en 50 avant Jésus-Christ, du temps où la Gaule est occupée par les Romains.");
		goscinny.lireHistoire();
	}

}
