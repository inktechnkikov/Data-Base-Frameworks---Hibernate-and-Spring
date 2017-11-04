package openclosed.grapthieditor;

import openclosed.grapthieditor.models.GraphicEditor;
import openclosed.grapthieditor.models.Square;

public class starter {

	public static void main(String[] args) {
		
			GraphicEditor graphicEditor = new GraphicEditor(new Square());
			System.out.println(graphicEditor.drawCurrentShape());
	}

}
