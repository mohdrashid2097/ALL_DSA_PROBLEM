package SimpleDesignPattern;

public class ClientFactory {
	
	// Factory Design Pattern
	// Factory Design Pattern is a creational design pattern that provides an interface for creating objects without 
	// exposing the object-creation logic to the client.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NotificationFactory factory = new NotificationFactory();
		Notification notification = factory.createNotification("Email");
		notification.send();

	}

}
