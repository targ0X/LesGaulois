package personnages;

public enum Equipement {
CASQUE("casque"),BOUCLIER("bouclier");
private Equipement(String nom) {
	this.nom = nom;
}

private String nom;
private Equipement[] equipements;
private int nbEquipements=0;
@Override
public String toString() {
	return nom;
}
}
