package SimpleDesignPattern;

public class ClientFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NotificationFactory factory = new NotificationFactory();
		Notification notification = factory.createNotification("Email");
		notification.send();

	}

}
