package personnages;

public class Romain {
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert forcePositive();
	}
	private String nom;
	private int	force;
	private int force2;
	
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
		assert forcePositive();
	    force2 = force;
		force2-=forceCoup;
		if (force2>0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		assert forceDiminuee();
	}
	private boolean forcePositive() {
		if (force<0) {
			return false;
		} else {
			return true;
		}
	}
	private boolean forceDiminuee() {
		if (force2>=force) {
			return false;
		} else {
			return true;
		}
	}
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		System.out.println("Les équipements sont :");
		for (Equipement equipement : Equipement.values()){
			System.out.println("- " + equipement);
		}
	}
}
