package sets;

import java.util.ArrayList;
import java.util.HashSet;

public class TestSetInt {

	public static void main(String[] args) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		HashSet<Integer> entiers = new HashSet<Integer>();
		entiers.add(-1);
		entiers.add(5);
		entiers.add(7);
		entiers.add(3);
		entiers.add(-2);
		entiers.add(4);
		entiers.add(8);
		entiers.add(5);
		
		ArrayList<Integer> list = new ArrayList<>();
		
		/** affiche tous les éléments de la liste */
		for (Integer monElement : entiers) {
			System.out.println(monElement);
			list.add(monElement);
		}
		
		/** recherche le plus petit élément de la liste */
		for(int i=0;i<list.size();i++){
			if(min>list.get(i))
				min=list.get(i);
		}
		System.out.println("\n"+min);

		/** recherche le plus grand élément de la liste */
		for(int i=0;i<list.size();i++){
			if(max<list.get(i))
				max=list.get(i);
		}
		System.out.println("\n"+max);

		/** recherche les éléments négatifs et les modifis */
		for(int i=0;i<list.size();i++){
			if(list.get(i)<0){
				list.set(i,-list.get(i));
			}
		}
	}
}