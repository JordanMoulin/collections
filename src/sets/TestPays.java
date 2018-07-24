package sets;

import java.util.ArrayList;
import java.util.HashSet;

public class TestPays {

	public static void main(String[] args) {
		int index = 0;
		HashSet<Pays> pays = new HashSet<Pays>();
		pays.add(new Pays("USA", 324_811_000, 55_805.204));
		pays.add(new Pays("France", 67_795_000, 41_180.697));
		pays.add(new Pays("Allemagne", 82_800_000, 45_888.423));
		pays.add(new Pays("UK", 65_648_100, 41_158.909));
		pays.add(new Pays("Italie", 60_589_445, 35_708));
		pays.add(new Pays("Japon", 126_451_398, 41_300));
		pays.add(new Pays("Chine", 1_415_140_963, 14_107.431));
		pays.add(new Pays("Russie", 146_880_400, 24_026));
		pays.add(new Pays("Inde", 1_281_935_911, 5_855.306));
		
		ArrayList<Pays> listP = new ArrayList<>();
		listP.addAll(pays);
		
		/** Recherche du pays avec le meilleurs PIB/habitant */
		double bestPIB = listP.get(0).getPIB();
		for(int i=0;i<listP.size();i++){
			if(bestPIB<listP.get(i).getPIB()){
				bestPIB=listP.get(i).getPIB();
				index = i;
			}
		}
		//System.out.println(listP.get(index).getNom());
		
		/** Recherche du pays avec le meilleurs PIB */
		double PIBtotal=0;
		for(int i=0;i<listP.size();i++){
			if(PIBtotal<listP.get(i).getPibTotal()){
				PIBtotal = listP.get(i).getPibTotal();
				index = i;
			}
		}
		//System.out.println(listP.get(index));
		
		/** Mettre en majuscule le pays avec le plus petit PIB */
		for(int i=0; i<listP.size();i++){
			if(listP.get(i).getPibTotal()<PIBtotal){
				PIBtotal = listP.get(i).getPibTotal();
				index = i;
			}
		}
		listP.get(index).setNom(listP.get(index).getNom().toUpperCase());;
		System.out.println(listP);
	}
}
