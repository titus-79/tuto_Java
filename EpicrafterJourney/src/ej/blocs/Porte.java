package ej.blocs;

import java.util.function.Predicate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ej.IllegalBlocException;
import ej.PorteVerrouilleException;

public class Porte extends Bloc {

	private boolean verrouille;

	private static Logger logger = LogManager.getLogger(Porte.class);

	public Porte(final int longueur, final int largeur, final int hauteur, final boolean verrouille)
			throws IllegalBlocException {
		super(longueur, largeur, hauteur, Couleur.BLEU);
		this.verrouille = verrouille;
	}

	@Override
	public void afficherUneDescription() {
		System.out.println("Je suis une porte verrouillée " + verrouille);
	}

	private boolean estVerrouillee() {
		if (this.verrouille) {
			return true;
		} else {
			return false;
		}
	}

//	public boolean estVerrouillee() {
//		return verrouillee;
//	}

	public void verrouiller() throws PorteVerrouilleException {
		if (!estVerrouillee()) {
			verrouille = true;
		} else {
			logger.error("La porte est déja vérrouillée.");
			throw new PorteVerrouilleException();
		}
	}
	
	public void forcerSerrure(Predicate<String> fonction) {
		String cleScrete = "#secret123";
		if(this.verrouille) {
			if(fonction.test(cleScrete)) {
				this.verrouille = false;
			}
		}
	}

}
