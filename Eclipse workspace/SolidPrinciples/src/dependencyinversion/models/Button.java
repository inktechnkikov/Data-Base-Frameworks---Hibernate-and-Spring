package dependencyinversion.models;

import dependencyinversion.interfaces.SwitchableDevices;

public class Button {
	
	private SwitchableDevices devices;
	//private Lamp lamp;
	
	public Button(Lamp lamp) {
		this.devices = lamp;
	}

	public void buttonOn() {
		this.devices.turnOn();
	}
	public void buttonOff() {
		this.devices.turnOff();
	}
}
