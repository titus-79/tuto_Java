package ej.kits;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import ej.blocs.IBloc;
import ej.blocs.Mur;
import ej.blocs.Porte;
import ej.exceptions.IllegalBlocException;

public class Kit {

	private Set<IBloc> blocs = new LinkedHashSet<IBloc>();
	private Set<String> motsCles = new LinkedHashSet<String>();

	public Kit() throws IllegalBlocException {
//		Liste<Bloc> blocs = new Liste<Bloc>(Bloc.class,5);
		blocs.add(new Mur(3, 2, 2, true));
		blocs.add(new Mur(3, 2, 2, true));
		blocs.add(new Mur(2, 1, 2, false));
		blocs.add(new Mur(2, 1, 2, true));
		blocs.add(new Porte(1, 2, 2, true));

//		Set<String> motsCles = new LinkedHashSet<String>();
		motsCles.add("Cabane");
		motsCles.add("Muraille");
	}

	public void afficherKit() {
		System.out.println("Nombre de bloc dans le kit : " + blocs.size());
		System.out.print("Liste des mots clés du kit : ");
		for (String motCle : motsCles) {
			System.out.print(motCle + " ");
		}
	}

	public Set<String> getMotsCles() {
//		return motsCles; test du try catch
		return null;
	}

	public Set<IBloc> getBlocs() {
		return blocs;
	}
}
