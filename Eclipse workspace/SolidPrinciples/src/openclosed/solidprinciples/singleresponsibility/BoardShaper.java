package openclosed.solidprinciples.singleresponsibility;

import java.util.ArrayList;

public class BoardShaper {
	private int size;

	public BoardShaper(int size) {
		this.size = size;
	}
	
	public ArrayList<ArrayList<Integer>> rowIndex(){
		ArrayList<ArrayList<Integer>> rowIndexes = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < size; i++) {
			ArrayList<Integer> row = new ArrayList<Integer>();
			for (int j = 0; j < size; j++) {
				row.add((i*size) + (j));
			}
			rowIndexes.add(row);
		}
		return rowIndexes;
	}
}
