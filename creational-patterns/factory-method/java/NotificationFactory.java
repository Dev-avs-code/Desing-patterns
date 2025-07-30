public abstract class NotificationFactory {
    /*
     * Crea una notificación usando el factory method.
     * Este método delegará la creación de la notificación a las subclases.
     */
    public abstract Notification createNotification();

    public void sendNotification() {
        Notification notification = createNotification();
        notification.send();
    }
}
