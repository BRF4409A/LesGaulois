package test_fonctionnel;

import personnages.Druide;

public class TestGaulois {
	public static void main(String[] args) {
		Druide panoramix  = new Druide("Panoramix", 8);
		panoramix.concocterPotion();
	}
}
