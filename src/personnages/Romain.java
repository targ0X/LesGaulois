package personnages;

public class Romain {
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	private String nom;
	private int	force;
	
	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« "+texte+"»");
	}

	private String prendreParole() {
		return "Le romain " + nom + ":";
	}
	public void recevoirCoup(int forceCoup) {
		force-=forceCoup;
		if (force>0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
	}
}
