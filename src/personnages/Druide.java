package personnages;

public class Druide {
	public String getNom() {
		return nom;
	}
	
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide" + nom + "et ma potion peut aller d'une force"+ effetPotionMin + " � " + effetPotionMax +".");
	}
	
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	
	public void parler(String texte) {
		System.out.println(prendreParole()+"�"+texte+"�");
	}
	private String prendreParole() {
		return "Le druide"+ nom + ": ";
	}
}
