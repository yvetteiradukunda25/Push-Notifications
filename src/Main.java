public class Main {
    public static void main(String[] args) {
 //Email
        NotificationService email = new EmailNotification("iradyvette98@gmail.com");
        //try to write an email with no '@'
        email.sendNotification("Message well received");

        //SMS

        NotificationService sms = new SMSNotification();
        sms.sendNotification("Verification code is ...");

        // Push Notification with device ID
        NotificationService push = new PushNotification("device-005");
        push.sendNotification("Push Notification");
        push.setDefaultPriority("High");

    }
}