package dependencyinversion.servicenotification.models;

import dependencyinversion.servicenotification.intefaces.Notificator;

public class SmsNotification implements Notificator{
	
	private boolean isActiveService;
	
	public SmsNotification(boolean isActiveService) {
		this.isActiveService = isActiveService;
	}

	@Override
	public boolean isActive() {
		return this.isActiveService;
	}

	@Override
	public void sendNotifacation() {
		System.out.println("Notification sent");
		
	}

}
