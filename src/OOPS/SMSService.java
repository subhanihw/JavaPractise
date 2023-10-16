package OOPS;

public class SMSService implements MessagingService{
    @Override
    public void sendMessage(String message) {
        System.out.println("Message Sent through SMS");
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Received message through SMS");
    }
}
