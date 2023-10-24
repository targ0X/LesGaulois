package personnages;


public class Gaulois {
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	private String nom;
	private int effetPotion = 1;
	private int force;
	private int nbtrophees;
	private Equipement[] trophees = new Equipement[100];

	
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
	
	
//	private String prendreParole() {
//		return "Le gaulois "+nom+" : ";	
//	}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		}

	
//	public void frapper(Romain romain) {
//		System.out.println(nom+" envoie un grand coup dans la mâchoire de "+ romain.getNom());
//		romain.recevoirCoup(((force/3)*effetPotion));
//	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la m�choire de " + romain.getNom());
		trophees = romain.recevoirCoup((force / 3) *effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,nbtrophees++) {
			this.trophees[nbtrophees] = trophees[i];
			}
		return;
		}

	
	
	public void boirePotion(int forcePotion) {
		effetPotion=forcePotion;
		parler("Merci Druide, je sens que ma force est " + effetPotion + " fois décuplée ");
	}
	
	
	public int getForce() {
		return force;
	}
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8);
		Romain abribus = new Romain("Abribus",13);
		Druide kao = new Druide("Kao",3,10);
		asterix.boirePotion(kao.preparerPotion());
		asterix.frapper(abribus);
	}
}

