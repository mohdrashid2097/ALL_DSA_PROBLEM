package SimpleDesignPattern1;

public class EmailNotificationFactory implements NotificationFactory{

	@Override
	public Notification getNotification() {
		// TODO Auto-generated method stub
		return new EmailNotification();
	}

}
