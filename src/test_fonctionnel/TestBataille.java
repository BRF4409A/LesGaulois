package test_fonctionnel;

import personnages.Conteur;

public class TestBataille {
	public static void main(String[] args) {
		Conteur goscinny  = new Conteur("Goscinny");
		goscinny.presenter("Je suis Goscinny. Je vais vous conter une histoire qui se d�roule en 50 avant J�sus-Christ, du temps o� la Gaule est occup�e par les Romains.");
		goscinny.lireHistoire();
	}

}
