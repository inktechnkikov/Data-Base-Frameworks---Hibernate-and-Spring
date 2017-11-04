package dependencyinversion.servicenotification;

import dependencyinversion.servicenotification.models.EmailNotification;
import dependencyinversion.servicenotification.models.OnlineStoreOrder;
import dependencyinversion.servicenotification.models.SmsNotification;

public class starter {

	public static void main(String[] args) {
		OnlineStoreOrder onlineStoreOrder = new OnlineStoreOrder(new SmsNotification(false),new EmailNotification());
		onlineStoreOrder.process();
	}

}
