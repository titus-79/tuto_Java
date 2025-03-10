package ej;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ej.blocs.IBloc;
import ej.IllegalBlocException;

public class KitDemarrage {

	private Logger logger = LogManager.getLogger(KitDemarrage.class);
	private Set<IBloc> blocs = new LinkedHashSet<IBloc>();
	private Set<String> motsCles = new LinkedHashSet<String>();

	public Set<IBloc> getBlocs() {
		return blocs;
	}

	public Set<String> getMotsCles() {
		return motsCles;
	}

	public KitDemarrage(final Set<IBloc> blocs) throws IllegalBlocException {
		this.blocs.addAll(blocs);

		motsCles.add("Cabane");
		motsCles.add("Muraille");
		motsCles.add("Maison");
	}

	public void afficherKit() {
		
//		System.out.println("Nombre de blocs dans le kit : " + blocs.size());
		System.out.println("Nombre de blocs dans le kit : " + this.blocs.size());
		System.out.print("Liste des mots clés du kit : ");

//		for (String motCle : motsCles) {
//			System.out.print(motCle + " ");
//		}

//		programmation fonctionnelle 
//		transmet une fonction anonyme dite "lambda" en parametre d'une autre fonction
//		Consumer<String> fonction = (motCle) -> {
//			System.out.print(motCle + " ");
//		};
//		motsCles.forEach(fonction);
		
//		Consumer<String> fonctionAnonyme = (text) -> {System.out.print(text + "/");};
//	    this.motsCles.forEach(fonctionAnonyme);
		
//		Reference au methode
		this.motsCles.forEach(System.out::println);

	}
	public void sauvegarder() {
		StringBuilder builder = new StringBuilder();
		builder.append("Kit de démarrage\n");
		motsCles.forEach((motCle) -> builder.append(motCle + " "));
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("kit.txt"));
			writer.write(builder.toString());
			writer.close();
//			System.out.println("kit.txt ecrit");
			logger.info("kit.txt ecrit");
		} catch(IOException e) {
			logger.error("Impossible d'écrire dans le fichier");
		}
	}

}