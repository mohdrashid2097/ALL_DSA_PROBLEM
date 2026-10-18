package SimpleDesignPattern1;

public class NotificationFactoryProvider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Email Notification
		
		//Abstract Factory Pattern provides an interface for creating families of related or 
		//dependent objects without specifying their concrete classes.
		
		EmailNotificationFactory emailFactory = new EmailNotificationFactory();
		Notification emailNotification = emailFactory.getNotification();
		emailNotification.send();
		
		//SMS Notification
		SMSNotificationFactory smsFactory = new SMSNotificationFactory();
		Notification smsNotification = smsFactory.getNotification();
		smsNotification.send();

	}

}
