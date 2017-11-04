package openclosed.ExtendedArrListOpenClosed;

import java.util.ArrayList;
import java.util.Iterator;

public class ExtendedArrayList<E extends Comparable<E>> extends ArrayList<E> {
		
	public E max() {
		E max = null;
		Iterator<E> iterator = super.iterator();
		while (iterator.hasNext()) {
			E element = iterator.next();
			if(max == null || element.compareTo(max) > 0) {
				max = element;
			}
			
		}
		return max;
	}
	
	public E min() {
		E minE = null;
		Iterator<E> iterator = super.iterator();
		while (iterator.hasNext()) {
			E element = iterator.next();
			if(minE == null || element.compareTo(minE) < 0) {
				minE = element;
			}
		}
		return minE;
	}
	
}
