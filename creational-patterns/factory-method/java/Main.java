public class Main{
    public static void main(String[] args) {
        NotificationFactory email = new EmailCreator();
        email.createNotification();
        email.sendNotification();

        NotificationFactory sms = new SMSCreator();
        sms.createNotification();
        sms.sendNotification();
    }
}