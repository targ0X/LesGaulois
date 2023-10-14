package personnages;


public class Romain {
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		EQuipement = new Equipement[nbequipementmax];
		assert forcePositive();
	}
	private static final int nbequipementmax=2;
	private String nom;
	private int	force;
	private int force2;
	
	private Equipement[] EQuipement;
	private int nbEquipement=0;
	
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
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2:
			System.out.println("Le soldat "+nom+" est déjà bien protégé !");
			break;
		case 1:
			if (EQuipement[0]==equipement) {
				System.out.println("Le soldat "+nom+" possède déjà "+equipement+" !");
			} else {
				System.out.println("Le soldat "+ nom +" s'équipe avec un "+equipement);
				nbEquipement++;
			}
			break;
		default:
			EQuipement[nbEquipement]=equipement;
			nbEquipement++;
			System.out.println("Le soldat "+ nom +" s'équipe avec un "+equipement);
			break;
		}
	}
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		System.out.println("Les équipements sont :");
		for (Equipement equipement : Equipement.values()){
			System.out.println("- " + equipement);
		}
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
	}
}
