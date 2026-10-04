package SimpleDesignPattern1;

public class SMSNotificationFactory implements NotificationFactory{

	@Override
	public Notification getNotification() {
		// TODO Auto-generated method stub
		return new SMSNotification();
	}

}
