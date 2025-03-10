package ej.blocs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ej.IllegalBlocException;

//	La classe abstraite ne peut etre instanciée, elle est faite pour etre herite.
public abstract class Bloc implements IBloc {

	protected int longueur;
	protected int largeur;
	protected int hauteur;
	protected Couleur couleur;

	private static Logger logger = LogManager.getLogger(Bloc.class);

	public Bloc(final int longueur, final int largeur, final int hauteur, final Couleur couleur) throws IllegalBlocException {
		if (longueur < MIN_LONGUEUR || largeur < MIN_LARGEUR || hauteur < MIN_HAUTEUR) {
			throw new IllegalBlocException();
		}
		this.hauteur = hauteur;
		this.largeur = largeur;
		this.longueur = longueur;
		this.couleur = couleur;

//		logger.info("le bloc a été construit.");
		logger.info("Un bloc de type " + this.getClass().getSimpleName() + " a été construit.");

	}

	public int getLongueur() {
		return longueur;
	}

	public int getlargeur() {
		return largeur;
	}

	public int gethauteur() {
		return hauteur;
	}

	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}

	public void afficherUneDescription() {
		System.out.println("Je suis un bloc !");
	}

}
