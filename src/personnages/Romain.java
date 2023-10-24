package personnages;


public class Romain {
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		EQuipement = new Equipement[NBEQUIPEMENTMAX];
		assert forcePositive();
	}
	private static final int NBEQUIPEMENTMAX=2;
	private String nom;
	private int	force;
	private int force2;
	
	private Equipement[] EQuipement;
	private int nbEquipement=0;
	
	
	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "Â« "+texte+"Â»");
	}

	private String prendreParole() {
		return "Le romain " + nom + ":";
	}
//	public void recevoirCoup(int forceCoup) {
//		assert forcePositive();
//	    force2 = force;
//		force2-=forceCoup;
//		if (force2>0) {
//			parler("AÃ¯e");
//		} else {
//			parler("J'abandonne...");
//		}
//		assert forceDiminuee();
//	}
	
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// prÃ©condition
		assert force > 0;
		int oldForce = force;
		forceCoup = calculResistanceEquipement(forceCoup);
		force -= forceCoup;
		// if (force > 0) {
		// parler("AÃ¯e");
		// } else {
		// equipementEjecte = ejecterEquipement();
		// parler("J'abandonne...");
		// }
		if (force==0) {
			parler("Aie");
		} else {
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
			}
			// post condition la force a diminuÃ©e
			assert force < oldForce;
			return equipementEjecte;
	}
	
	private int calculResistanceEquipement(int forceCoup) {
  String texte;
		texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement != 0) {
			texte=texte+"\nMais heureusement, grace a mon eqquipement sa force est diminuée de ";
			for (int i = 0; i < nbEquipement;i++) {
				if ((EQuipement[i] != null && EQuipement[i].equals(Equipement.BOUCLIER))) {
					resistanceEquipement += 8;
					} else {
						System.out.println("Equipement casque");
						resistanceEquipement += 5;
						}
				}
			texte += resistanceEquipement + "!";
			}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
		}
	
	
	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'Ã©quipement de " + nom + "s'envole sous la force du coup.");
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (EQuipement[i] != null) {
				equipementEjecte[nbEquipementEjecte] =
				EQuipement[i];
				nbEquipementEjecte++;
				EQuipement[i] = null;
				}
			}
				return equipementEjecte;
}
	
	private boolean forcePositive() {
		return (force<0);
	}
	
	private boolean forceDiminuee() {
		return (force2>=force); 
	}
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2:
			System.out.println("Le soldat "+nom+" est déjà bien protégé !");
			break;
		case 1:
			if (EQuipement[0]==equipement) {
				System.out.println("Le soldat "+nom+" possède déjà  "+equipement+" !");
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
		System.out.println("Les Ã©quipements sont :");
		for (Equipement equipement : Equipement.values()){
			System.out.println("- " + equipement);
		}
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
	}
}
