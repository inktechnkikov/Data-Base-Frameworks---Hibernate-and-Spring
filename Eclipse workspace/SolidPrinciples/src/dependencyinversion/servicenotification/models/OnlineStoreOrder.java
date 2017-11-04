package dependencyinversion.servicenotification.models;

import dependencyinversion.servicenotification.intefaces.Notificator;

public class OnlineStoreOrder {
	
	private Notificator[] notificatorServices;
	
	public OnlineStoreOrder(Notificator... notificatorServices) {
		this.notificatorServices = notificatorServices;
	}
	public void process() {
		for (Notificator notificationService : notificatorServices) {
			if(notificationService.isActive()) {
				notificationService.sendNotifacation();
			}else {
				System.out.println("please enable service");
			}
		}
	}
}
