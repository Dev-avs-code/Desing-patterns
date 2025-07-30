public class SMSCreator extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
