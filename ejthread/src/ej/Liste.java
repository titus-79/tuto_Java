package ej;

import java.lang.reflect.Array;

public class Liste<T> {
	private T[] liste;

	@SuppressWarnings("unchecked")
	public Liste(Class<T> classe, int quantite) {
		this.liste = (T[]) Array.newInstance(classe, quantite);
	}

	public void add(int indice, T valeur) {
		this.liste[indice] = valeur;
	}

	public T get(int indice) {
		return this.liste[indice];
	}

}
