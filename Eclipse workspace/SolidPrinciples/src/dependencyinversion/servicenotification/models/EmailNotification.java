package dependencyinversion.servicenotification.models;

import dependencyinversion.servicenotification.intefaces.Notificator;

public class EmailNotification implements Notificator{
	private boolean isActive;
	
	@Override
	public boolean isActive() {
	return this.isActive;
	}

	@Override
	public void sendNotifacation() {
		System.out.println("Notification send");
		
	}

}
