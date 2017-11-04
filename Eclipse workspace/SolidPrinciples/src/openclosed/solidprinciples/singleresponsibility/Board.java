package openclosed.solidprinciples.singleresponsibility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Board {
	int size;
	List<String> spots;
	
	public Board(int size) {
		this.size = size;
		this.spots = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			this.spots.add(String.valueOf(3*i));
			this.spots.add(String.valueOf(3*i + 1));
			this.spots.add(String.valueOf(3*i + 2));
		}
	}
	public ArrayList<String> valueAt(ArrayList<Integer> indexes){
		List<String> values = new ArrayList<>();
		for (int index : indexes) {
			values.add(this.spots.get(index));
		}
		return (ArrayList<String>) values;
	}
}
