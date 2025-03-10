package ej;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
//		int num;
//		num = 5;
//		num = 10;
//		
//		final int immuable = 20;
//		
//		String langage = "Java";
//		String phrase = langage + " est un langage de progammation.";
//		System.out.println(phrase);
//		
//		int[] unTableauDEntier = {5,10,15,20};
//		unTableauDEntier[0];
//		
//		char[] unTableauDeChar = new char[3];
//		unTableauDeChar[0] = 'a';
//		unTableauDeChar[1] = 'b';
//		unTableauDeChar[2] = 'c';
//		
//		int [][] unTableauBiDimentionnel = new int[2][3];
//		
//		var unEntier = 5;
		
		String texte = "Hello World!";
//		System.out.println(texte);
		
		int somme = Main.addition(2, 7);
		System.out.println(somme);
		
//		Main.affiche(texte);
		
		Main.decompte(somme);
		
		String prenom = "Marty";
		Main.affichage(prenom);
		affichage("Biff");
		

		int chiffre = 2;
		Main.chiffreEgalAZero(chiffre);
		
//		boolean soleil = false;
//		Main.meteo(soleil);
		
		String prevision = "soleil";
		Main.meteo(prevision);
		
		Main.commenteLaMeteo(prevision);
		Main.commenteLaMeteo("nuage");
		Main.commenteLaMeteo("pluie");
		Main.commenteLaMeteo("aaaa");
		
		System.out.println(categorieDeFilm("Star Wars"));
		System.out.println(categorieDeFilm("Blanche neige"));
		System.out.println(categorieDeFilm("Indiana Jones"));
		System.out.println(categorieDeFilm("La petite sirène"));		
		System.out.println(categorieDeFilm("Waynes World"));
		
		affiche(0);
		affiche(1);
		affiche(5);
		compteJusquaDix();
		
		
		
	    List<String> nomsDesLangages = Arrays.asList("Java", "PHP", "JavaScript", "C#");
	    for (String nomDUnLangage : nomsDesLangages) {
	    	String resultat = nomDUnLangage.toUpperCase();
	        System.out.println(resultat);
	    }
	    
	    int[] tableauEntier = {26,10,1985,0,12,11,1955,0};
	    int cpt = 0;
	    for (int entier : tableauEntier) {
	    if (entier == 0) {
	    	cpt++;
	    }
	    }
	    System.out.println(cpt);
	    cpt = 0;
	    
	    for(int i=0; i<tableauEntier.length; i++) {
	    	if (tableauEntier[i] == 0) {
	    		cpt++;
	    	}
	    }
	    System.out.println(cpt);
	    
//	    Bloc unBloc = new Bloc();
//	    unBloc.afficherDescription();
	    
	    Bloc unBloc = new Bloc("Ceci est le premier bloc");
	    unBloc.afficherDescription();
	    Bloc unAutreBloc = new Bloc("Ceci est un autre bloc");
	    unAutreBloc.afficherDescription();
	    unAutreBloc.setDescription("Ceci est un bloc modifié par le setter");
	    unAutreBloc.afficherDescription();

	
	}
	
	
	
	
		
//	public static void affiche() {
//		System.out.println("Une fonction en java a été éxécutée");
	
	
//	public static void affiche(String texte) {
//		System.out.println(texte);
//	}
	
	public static int addition(final int entier1, final int entier2) {
		return entier1 + entier2;
	}
	
	public static void decompte(final int valeur) {
		if(valeur >= 0) {
			System.out.println(valeur);
			chiffreEgalAZero(valeur);
			decompte(valeur-1);
		}
	}
	
	public static void affichage(String texte) {
		 String phrase = "Bonjour " + texte;
		 System.out.println(phrase);
	}
	
	public static void chiffreEgalAZero(final int valeur) {
		if(valeur == 0) {
			System.out.println("L'entier passé en paramètre vaut 0");
		} else {
		System.out.println("L'entier passé en paramètre est différent de 0");
		}
		}
	
//	public static void meteo(final boolean beauTemps) {
//		if(beauTemps) {
//			System.out.println("Je vais à la plage");
//		} else {
//			System.out.println("Je vais au cinéma");
//		}
//	}
	

//	public static void meteo(final boolean beauTemps) {
//		if(!beauTemps) {
//			System.out.println("Le temps n'est pas beau.");
//		}
//	}
	
	public static void meteo(final String temps) {
		if(temps.equals("soleil")) {
			System.out.println("Je vais à la plage");
		}
	}
	
	public static void commenteLaMeteo(final String meteo) {
	switch(meteo) {
	case "soleil" -> System.out.println("Beau temps");
	case "nuage" -> System.out.println("Couvert");
	case "pluie" -> System.out.println("Mauvais temps");
	default -> System.out.println("Je ne sais pas.");
 	}
	}
	
	public static String categorieDeFilm(final String film) {
		var resultat = switch(film) {
		case "Star Wars" ->"Science fiction";
		case "Blanche neige", "La petite sirène" -> "Disney";
		case "Indiana Jones" -> {
		String categorie = "Aventure";
		yield categorie;
		}
		default -> "Inconnu";
		};
 		return resultat;
		}
	
//	public static void affiche() {
//	    int chiffre = 0;
//	    while(chiffre < 5) {
//	        System.out.println(chiffre);
//	        chiffre++;
//	    }
//	}
	
	public static void affiche(int num) {
	    int chiffre = num;
	    do {
	        System.out.println(chiffre);
	        chiffre++;
	    } while(chiffre == 1);
	}
	
	public static void compteJusquaDix() {
	    for(int i=1; i<=10; i++) {
	        System.out.println(i);
	    }
	}
	
	
	
}

