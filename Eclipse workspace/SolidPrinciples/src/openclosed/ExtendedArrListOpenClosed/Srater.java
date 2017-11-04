package openclosed.ExtendedArrListOpenClosed;

import java.util.List;

public class Srater {

	public static void main(String[] args) {
		
		ExtendedArrayList<Integer> list = new ExtendedArrayList<>();
		list.add(1);
		list.add(10);
		list.add(22);
		list.add(0);
		list.add(8);
		System.out.println(list.max());
		System.out.println(list.min());
	}

}
