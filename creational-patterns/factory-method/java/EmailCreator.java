public class EmailCreator extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
