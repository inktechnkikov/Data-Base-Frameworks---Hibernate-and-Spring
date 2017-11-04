package dependencyinversion;

import dependencyinversion.models.Button;
import dependencyinversion.models.Lamp;

public class starter {
	public static void main(String args[]) {
		Button button = new Button(new Lamp());
		button.buttonOff();
	}
}
