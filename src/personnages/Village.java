package personnages;
import personnages.Gaulois;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois=0;
	private Gaulois[] villageois;
	private int nbVillageoisMaximum;
	
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.nbVillageoisMaximum = nbVillageoisMaximum;
		villageois = new Gaulois[nbVillageoisMaximum];
	}
	public void setChef(Chef chef) {
	this.chef = chef;
	}

	
	public String getNom() {
	return nom;
	}
	public void ajouterHabitant(Gaulois gaulois ) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
	}
	public Gaulois trouverHabitant(int indice) {
		return villageois[indice];
	}
	public void afficherVillageois(Chef chef) {
		System.out.println("Dans le Village du chef "+ chef +" vivent les légendaires gaulois :");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("- "+villageois[i].getNom());
		}
	}
	public static void main(String[] args) {
	Village village = new Village("Village des Irréductibles",30);
//	Gaulois gaulois = village.trouverHabitant(30);
//	index qui n'est pas dans le tableau car valeur de l'indice 0 à 29
	Chef abraracourcix = new Chef ("Abraracourcix",6,village);
	Gaulois asterix = new Gaulois ("Astérix",8);
	Gaulois obelix = new Gaulois ("Obélix",25);
	village.setChef(abraracourcix);
//	village.ajouterHabitant(abraracourcix); impossible car type Chef et non Gaulois
	village.ajouterHabitant(asterix);
	village.ajouterHabitant(obelix);
//	Gaulois gaulois = village.trouverHabitant(0);
//	System.out.println(gaulois);
//  null car pas de gaulois a cet endroit la
	village.afficherVillageois(abraracourcix);
	}
}