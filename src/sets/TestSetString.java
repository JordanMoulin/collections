package sets;

import java.util.ArrayList;
import java.util.HashSet;

public class TestSetString {
	public static void main(String[] args) {
		HashSet<String> hashl = new HashSet<String>();
		hashl.add("USA");
		hashl.add("France");
		hashl.add("Allemagne");
		hashl.add("UK");
		hashl.add("Italie");
		hashl.add("Japon");
		hashl.add("Chine");
		hashl.add("Russie");
		hashl.add("Inde");

		ArrayList<String> list = new ArrayList<>();

		/** Transfert le contenu de HashSet dans l'ArrayList */
		for (String monElement : hashl) {
			list.add(monElement);
		}

		/** Recherche du pays avec le plus de lettres */
		int taille = list.get(0).length();
		for(int i=0;i<list.size()-1;i++){
			if(list.get(i).length()>taille){
				taille = list.get(i).length();
			}
		}

		/** Mets les noms de villes en majuscules */
		for(int i=0; i<list.size();i++){
			list.set(i, list.get(i).toUpperCase());
			System.out.println(list.get(i));
		}
	}
}
