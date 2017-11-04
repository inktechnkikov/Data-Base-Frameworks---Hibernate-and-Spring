package openclosed.grapthieditor.models;

import openclosed.grapthieditor.asbtraction.Shape;
import openclosed.grapthieditor.interfaces.Drawable;

public class GraphicEditor {

	Drawable drawable;
	
	public GraphicEditor(Shape drawShape) {
		this.drawable = drawShape;
	}
	public String drawCurrentShape() {
		return this.drawable.draw();
	}
}
