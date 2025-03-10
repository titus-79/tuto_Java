package ej;

import java.awt.Window.Type;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ej.blocs.Bloc;
import ej.blocs.IBloc;
import ej.blocs.Mur;
import ej.blocs.Porte;
import ej.blocs.Rempart;
import ej.blocs.Toit;
import ej.blocs.TypeBloc;

public class Main {

	private static Logger logger = LogManager.getLogger(Main.class);

	public static void main(String[] args) throws IllegalBlocException, IOException {

//		logger.error("Test de logging");

//		Bloc unBloc = new Bloc(5,3,4);
//		System.out.println(unBloc.getLongueur());
//		System.out.println(unBloc.gethauteur());
//		System.out.println(unBloc.getlargeur());

//		Mur unBlocMur = new Mur(100, 100, 100, true);
//		unBlocMur.afficherBloc();
//
//		unBlocMur.afficherUneDescription();
//		unBlocMur.estTraversable();

//		Bloc unAutreBlocMur = new Mur(20, 20, 5, true);
//		unAutreBlocMur.afficherUneDescription();

//		IBloc encoreUnBlocMur = new Mur(10, 2, 3, true);
//		encoreUnBlocMur.afficherUneDescription();

//		Rempart monRempart = new Rempart(unBlocMur);

//		List<Integer> quantiteBlocsUtilises = new ArrayList<Integer>();
//		quantiteBlocsUtilises.add(1);
//		quantiteBlocsUtilises.add(3);
//		quantiteBlocsUtilises.add(1);
//
//		quantiteBlocsUtilises.remove(Integer.valueOf(3));
//
//		for (Integer quantite : quantiteBlocsUtilises) {
//			System.out.println(quantite);
//		}

//		Map<Bloc, Integer> quantiteBloc = new HashMap<Bloc, Integer>();
//		quantiteBloc.put(new Mur(1, 1, 1, true), 4);
//		quantiteBloc.put(new Porte(1, 1, 1, false), 4);
//
//		Set<Bloc> cles = quantiteBloc.keySet();
//		for (Bloc cle : cles) {
//			Integer valeur = quantiteBloc.get(cle);
//			System.out.println(cle.getClass().getName() + " : " + valeur);
//		}

//		Kit kitDeDemarrage = new Kit();
//		kitDeDemarrage.afficherKit();
//
//		try {
//			int resultat = kitDeDemarrage.getMotsCles().size();
//			System.out.println("Nombre de mot clés : " + resultat);
//		} catch (NullPointerException exception) {
//			System.out.println("Liste de mots clés indisponible.");
//		}

//		try {
//	        Bloc b = new Mur(0, 1, 1, false);
//	        b.afficherUneDescription();
//	    } catch (IllegalBlocException e) {
//	        System.out.println("Valeurs pour construire le bloc invalides");
//	    }

//		Porte porteVerrouillee = new Porte(1, 1, 1, true);
//		porteVerrouillee.afficherUneDescription();
//		try {
//			porteVerrouillee.verrouiller();
//		} catch (PorteVerrouilleException e) {
//			System.out.println("La porte est déjà verrouillée !");
//			e.printStackTrace();
//		}

//		PrintWriter writer = new PrintWriter(System.out);
//		writer.println("Test du Writer");
//		writer.flush();
//		writer.close();

//		BufferedReader fluxEntree = new BufferedReader(new InputStreamReader(System.in));
//		String saisieUtilisateur = fluxEntree.readLine();
//		System.out.println(saisieUtilisateur);
//		fluxEntree.close();
//	

//		logger.info("Lancement du programme Epicrafter's Journey.");
//		try {
//			// Le programme commence avec un Kit de démarrage.
//			Kit kit = new Kit();
//			System.out.println("Vous possédez un kit de démarrage !");
//			System.out.println(
//					"Que souhaitez-vous afficher ?\n\t1 - Les idées de constructions. \n\t2 - Le nombre de blocs pour chaque type de blocs présent dans le kit");
//			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//			String reponse = reader.readLine();
//			if (reponse.equals("1")) {
//				// code pour afficher les idées de constructions
//			} else if (reponse.equals("2")) {
//				// code pour affiche le nombre de blocs pour chaque type de blocs présent dans
//				// le kit
//			} else {
//				System.out.println("La valeur saisie n'est pas valide - tapez 1 ou 2.");
//			}
//		} catch (IllegalBlocException e) {
//			System.out.println("Impossible de construire le Kit de démarrage.");
//		}
//		logger.info("Arret du programme Epicrafter's Journey.");
		
		
		logger.info("Lancement du programme Epicrafter's Journey.");
		try {
			// Le programme commence avec un Kit de démarrage.
			KitDemarrage kit = new KitDemarrage(constructionSetBlocs());
			kit.afficherKit();
			kit.sauvegarder();
			System.out.println("Vous possédez un kit de démarrage !");
//			PrintWriter menu = new PrintWriter(System.out);
//			menu.println(
//			"Que souhaitez-vous afficher ? 1 - Les idées de constructions. 2 - Le nombre de blocs pour chaque type de blocs présent dans le kit");
//			menu.flush();
//			menu.close();
			System.out.println(
			        "Que souhaitez-vous afficher ? \n1 - Les idées de constructions. \n2 - Le nombre de blocs pour chaque type de blocs présent dans le kit");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String reponse = reader.readLine();

			if (reponse.equals("1")) {
				// Il affiche les mots clés associés au Kit pour donner des idées à l'utilisateur.
				System.out.println("Voici quelques idées de constructions avec le Kit de démarrage : ");
				Set<String> motsCles = kit.getMotsCles();
				for(String mot : motsCles) {
					System.out.println(mot);
				}			
			} else if(reponse.equals("2")) {
				// Il affiche à l'utilisateur le nombre de blocs en fonction du type à contenu par le Kit.
				System.out.println("Voici le nombre de blocs de chaque type contenu dans le Kit de démarrage : ");
				Map<TypeBloc, Integer> quantiteBloc = new TreeMap<TypeBloc, Integer>(); // La TreeMap permet de trier les entrées par ordre alphabétique de la clé.
				for (IBloc bloc : kit.getBlocs()) {
					TypeBloc type = TypeBloc.valueOf(bloc.getClass().getSimpleName().toUpperCase());
					int quantite = quantiteBloc.getOrDefault(type, 0) + 1; // Quantite existante + 1.
					quantiteBloc.put(type, quantite);
				}
				Set<TypeBloc> types = quantiteBloc.keySet();
				for(TypeBloc type : types) {
					System.out.println(type.toString() + " " + quantiteBloc.get(type));
				}	
			} else {
				System.out.println("La valeur saisie n'est pas valide - tapez 1 ou 2.");
			}
		} catch (IllegalBlocException e){
	        System.out.println("Impossible de construire le Kit de démarrage.");
		}catch (IOException e) {
			logger.error("Impossible de récupérer la saisie utilisateur.");
		}
		
		logger.info("Arret du programme Epicrafter's Journey.");
	}
	private static Set<IBloc> constructionSetBlocs() throws IllegalBlocException {
		Set<IBloc> blocs = new LinkedHashSet<IBloc>();

		// Le kit contient 4 blocs Mur.
		blocs.add(new Mur(3, 2, 2, true));
		blocs.add(new Mur(3, 2, 2, true));
		blocs.add(new Mur(2, 1, 2, false));
		blocs.add(new Mur(2, 1, 2, false));

		// Le kit contient 1 bloc Porte.
		blocs.add(new Porte(1, 2, 2, true));

		// Le kit contient 4 blocs Toit.
		blocs.add(new Toit(3, 1, 1));
		blocs.add(new Toit(3, 1, 1));
		blocs.add(new Toit(3, 1, 1));
		blocs.add(new Toit(3, 1, 1));

		return blocs;
	}
		
//		try {
//			Porte porte = new Porte(1,1,1,true);
//			porte.forcerSerrure((cle) -> {
//				return cle.matches("[A-Za-z]{3}");
//			});
//			porte.afficherUneDescription();
//			porte.forcerSerrure((cle) -> {
//				return cle.matches("#[A-Za-z]{6}123");
//			});
//			porte.afficherUneDescription();
//			// faille on peut contourner avec cette lambda:
//			porte.forcerSerrure((cle) -> {
//				return true;
//			});
//			porte.afficherUneDescription();
//		} catch(IllegalBlocException e) {
//			System.out.println("Impossible de créer le bloc.");
//		}
	
	
}

