package tri;

import java.util.Comparator;

public class ComparatorPibHabitant implements Comparator<Pays> {

	@Override
	public int compare(Pays o1, Pays o2) {
		if(o1.getPIB()<o2.getPIB()){
			return -1;
		}
		if(o1.getPIB()>o2.getPIB()){
			return 1;
		}
		return 0;
	}
}
