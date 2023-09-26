package personnages;
public class Gaulois {
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	private String nom;
	private int force;
	private int effetPotion = 1;
	
		public String getNom() {
	return nom;
	}
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}	
	public void parler(String texte) {
		System.out.println(prendreParole() + "«" +texte+ "»");
		
	}
	private String prendreParole() {
		return "Le gaulois "+nom+" : ";	
	}
	public void frapper(Romain romain) {
		System.out.println(nom+" envoie un grand coup dans la mâchoire de "+ romain.getNom());
	}
	public void boirePotion(int forcePotion) {
		System.out.printf("Merci Druide, je sens que ma force est ",forcePotion," fois décuplée . ");
	}
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8);
		Romain abribus = new Romain("Abribus",5);
		System.out.println(asterix);
		asterix.parler("Bonjour");
		asterix.frapper(abribus);
		abribus.recevoirCoup(8);
		abribus.parler("Bonjour");
	}
}

