package openclosed.solidprinciples.singleresponsibility;


public class BoardPresenter {
	
	Board board;
	
	
	public BoardPresenter() {
		this.board = board;
	}
	public void displayBoard() {
		String formatedBoard = "";
		for (int i = 0; i < this.board.size * this.board.size; i++) {
			String boardNewLine = "";
			if((i+1) % board.size == 0) {
				boardNewLine +="\n";
			}else {
				boardNewLine += "|";
			}
			formatedBoard += board.spots.get(i);
			formatedBoard += boardNewLine;
		}
		System.out.println(formatedBoard);
	}
}
