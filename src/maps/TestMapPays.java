package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class TestMapPays {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String choix;
		int code = 0;

		Map<String, Pays> hm = new HashMap<>();
		hm.put("USA",new Pays("USA", 324_811_000, 55_805.204));
		hm.put("France",new Pays("France", 67_795_000, 41_180.697));
		hm.put("Allemagne",new Pays("Allemagne", 82_800_000, 45_888.423));
		hm.put("UK",new Pays("UK", 65_648_100, 41_158.909));
		hm.put("Italie",new Pays("Italie", 60_589_445, 35_708));
		hm.put("Japon",new Pays("Japon", 126_451_398, 41_300));
		hm.put("Chine",new Pays("Chine", 1_415_140_963, 14_107.431));
		hm.put("Russie",new Pays("Russie", 146_880_400, 24_026));
		hm.put("Inde",new Pays("Inde", 1_281_935_911, 5_855.306));

		do{
			System.out.println("Quel pays ?");
			choix = scanner.next();
			Iterator valuesIte = hm.values().iterator(); 
			while (valuesIte.hasNext()) { 
				Pays u = (Pays) valuesIte.next();
				if(u.getNom().equals(choix)){
					System.out.println(u);
					code = 1;
					break;
				}
			}
			if(code==0){
				System.out.println("Le pays n'existe pas !");
			}else{
				code--;
			}
		}while(code==0);
		
		scanner.close();
	}
}
