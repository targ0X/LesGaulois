package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix,8",0);
		Romain minus = new Romain("Minus",6);
		asterix.parler("Bonjour � tous");
		minus.parler("UN GAU... UN GAUGAU..");
		asterix.frapper(minus);
		minus.recevoirCoup(8/3);
		asterix.frapper(minus);
		minus.recevoirCoup(8/3);
		asterix.frapper(minus);
		minus.recevoirCoup(8/3);
	}

}
