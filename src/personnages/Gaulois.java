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
//	@Override
//	public String toString() {
//		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
//	}	
	public void parler(String texte) {
		System.out.println(prendreParole() + "�" +texte+ "�");
		
	}
	private String prendreParole() {
		return "Le gaulois "+nom+" : ";	
	}
	public void frapper(Romain romain) {
		System.out.println(nom+"envoie un grand coup dans la m�choire de "+ romain.getNom());
	}
	public static void main(String[] args) {
		//TODO main test la classe gaulois 
	}
}

