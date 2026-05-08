package SimpleDesignPattern;

public class NotificationFactory {
	
	public Notification createNotification(String type) {
		
		if(type.equalsIgnoreCase("Email")) {
			return new EmailNotification();
		}
		if(type.equalsIgnoreCase("SMS")) {
			return new SMSNotification();
		}
		
		return null;
		
	}

}
