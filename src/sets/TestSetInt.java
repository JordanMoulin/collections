package sets;

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

		/** recherche le plus petit �l�ment de la liste */
		for(int i=0;i<entiers.size()-1;i++){
			if(min>entiers.)
				min=entiers.hashCode();
		}
		System.out.println(min);

		//		/** recherche le plus grand �l�ment de la liste */
		//		for(int i=0;i>entiers.size()-1;i++){
		//			if(max>entiers.get(i))
		//				max=entiers.get(i);
		//		}
		//		//System.out.println(min);
		//
		//		/** recherche les �l�ments n�gatifs et les modifis */
		//		for(int i=0;i<entiers.size()-1;i++){
		//			if(entiers.get(i)<0){
		//				entiers.set(i,-entiers.get(i));
		//			}
		//		}
		
		/** affiche tous les �l�ments de la liste */
		for (Integer monElement : entiers) {
			System.out.println(monElement);
		}
	}
}