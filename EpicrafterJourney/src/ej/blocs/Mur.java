package ej.blocs;

import ej.IllegalBlocException;

// Heritage la classe Mur étend la classe Bloc, elle devient une extension
public class Mur extends Bloc {

	private boolean porteur;

	public Mur(final int longueur, final int largeur, final int hauteur, final boolean porteur)
			throws IllegalBlocException {

		super(longueur, largeur, hauteur, Couleur.GRIS); // appel du constructeur de la classe mère
		this.porteur = porteur;
		
	}

	public void afficherBloc() {
		System.out.println(super.longueur + " " + super.largeur + " " + super.hauteur + " " + this.porteur);
	}

//	Polymorphisme à l'execution l'objet se presente sous un comportement différent,
//	la classe fille modifie le comportement de la classe mère.
//	Une méthode final ne peut pas être redéfinie !
//	Pour informer, le développeur qu’une méthode est redéfinie, on y ajoute l’annotation @Override juste avant la signature.
	@Override
	public void afficherUneDescription() {
		System.out.println("Je suis un mur !");
	}

//    Surcharge   L’une surcharge l’autre
//
//    public void afficheUneDescription(final String description) {
//        System.out.println(description);
//    }
//    
//    public void afficheUneDescription() {
//        this.afficheUneDescription(“Je suis un mur !”);
//    }

	public boolean estTraversable() {
		if (this.porteur) {
			System.out.println("Le mur n'est pas traversable");
			return false;
		} else {
			System.out.println("Le mur est traversable");
			return true;
		}
	}

//    public boolean estTraversable() {
//		return !porteur;
//	}

}