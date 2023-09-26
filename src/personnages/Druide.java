package personnages;
import java.util.Random;
public class Druide {
	public String getNom() {
		return nom;
	}
	
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force "+ effetPotionMin + " � " + effetPotionMax +".");
	}
	
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion=1;
	
	public void parler(String texte) {
		System.out.println(prendreParole()+"�"+texte+"�");
	}
	private String prendreParole() {
		return "Le druide"+ nom + ": ";
	}
	public void preparerPotion() {
		Random Potion = new Random();
		forcePotion=Potion.nextInt(effetPotionMax-effetPotionMin)+effetPotionMin;
		if (forcePotion>7) {
			parler("J'ai pr�par� une super potion de force "+ forcePotion);
			}else {
				parler("Je n'ai pas trouv� tous les ingr�dients, ma potion est seulement de force "+ forcePotion);
			}
	}
  public static void main(String[] args) {
	Druide panoramix=new Druide("Panoramix",5,10);
	panoramix.preparerPotion();
  }
}

