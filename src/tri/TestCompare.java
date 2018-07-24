package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class TestCompare {
	public static void main(String[] args) {
		ArrayList<Pays> list = new ArrayList<>();
		list.add(new Pays("USA", 324_811_000, 55_805.204));
		list.add(new Pays("France", 67_795_000, 41_180.697));
		list.add(new Pays("Allemagne", 82_800_000, 45_888.423));
		list.add(new Pays("UK", 65_648_100, 41_158.909));
		list.add(new Pays("Italie", 60_589_445, 35_708));
		list.add(new Pays("Japon", 126_451_398, 41_300));
		list.add(new Pays("Chine", 1_415_140_963, 14_107.431));
		list.add(new Pays("Russie", 146_880_400, 24_026));
		list.add(new Pays("Inde", 1_281_935_911, 5_855.306));
		Iterator<Pays> iterator = list.iterator();
		
		/** Tri sur PIB/hab (compareTo) */
//		Collections.sort(list);
//		iterator = list.iterator();
//		while (iterator.hasNext()){
//			//System.out.println(iterator.next());
//		}
		
		/** Tri avec la classe ComparatorHabitant */
		System.out.println("\nTri avec la classe ComparatorHabitant :");
		Collections.sort(list, new ComparatorHabitant());
		iterator = list.iterator();
		while (iterator.hasNext()){
			System.out.print(iterator.next());
		}
		
		/** Tri sur le PIB/habitant */
		System.out.println("\nTri avec la classe ComparatorPIBHabitant :");
		Collections.sort(list, new ComparatorPibHabitant());
		iterator = list.iterator();
		while (iterator.hasNext()){
			System.out.print(iterator.next());
		}
	}
}
