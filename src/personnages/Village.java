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
	
	public void ajouterHabitant(Gaulois personneaajouter ) {
		villageois[nbVillageois] = personneaajouter;
		nbVillageois++;
	}
	public Gaulois trouverHabitant(int indice) {
		return villageois[indice];
	}
	public static void main(String[] args) {
	Village village = new Village("Village des Irréductibles",30);
//	Gaulois gaulois = village.trouverHabitant(30);
//	index qui n'est pas dans le tableau car valeur de l'indice 0 à 29
	Chef abraracourcix = new Chef ("Abraracourcix",6,village);
	ajouterHabitant(abraracourcix);
	
	}
}