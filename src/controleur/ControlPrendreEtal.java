package controleur;

import frontiere.Clavier;
import villagegaulois.Village;

public class ControlPrendreEtal {
	private Village village;
	private ControlVerifierIdentite controlVerifierIdentite;

	public ControlPrendreEtal(ControlVerifierIdentite controlVerifierIdentite,
			Village village) {
		this.controlVerifierIdentite = controlVerifierIdentite;
		this.village = village;
	}

	public boolean resteEtals() {
		//TODO a completer, attention le retour ne dit pas etre false :-)
		return false;
	}

	public int prendreEtal(String nomVendeur, String produit, int nbProduit) {
		int numeroEtal = -1;
		if(!verifierIdentite(nomVendeur)) {
			System.out.println("Je suis désoler "+nomVendeur+"mais il faut être un habitant de notre village pour commercer ici.\n");
		}else {
			System.out.println("Bonjour "+nomVendeur+",je vais regarder si je peux vous trouver un étal.\n");
			if(!resteEtals()) {
				System.out.println("Désoler "+nomVendeur+"je n'ai plus d'étal qui ne soit pas déja occupé?\n");
			}else {
				System.out.println("C'est parfait il me reste un étal pour vous !\n");
				System.out.println("Il me faudrais quelques renseignements : \n");
				System.out.println("Quel produit souhaitez-vous vendre ?\n");
				nbProduit=Clavier.entrerEntier(produit);
			}
		}
		return numeroEtal;
	}

	public boolean verifierIdentite(String nomVendeur) {
		return village.trouverHabitant(nomVendeur)!=null;
	}
}
