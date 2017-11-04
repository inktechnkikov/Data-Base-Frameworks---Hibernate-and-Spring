package dependencyinversion.models;

import dependencyinversion.interfaces.SwitchableDevices;

public class Lamp implements SwitchableDevices{

	@Override
	public void turnOn() {
		System.out.println("the lamp is on");
		
	}

	@Override
	public void turnOff() {
		System.out.println("the lamp is off");
		
	}

}
