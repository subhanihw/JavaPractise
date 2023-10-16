package OOPS;

public class EmailService implements MessagingService{
    @Override
    public void sendMessage(String message) {
        System.out.println("Message Sent through Email");
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Received message through Email");
    }
}
