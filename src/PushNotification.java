public class PushNotification implements NotificationService {
    String deviceId;

    public PushNotification(String deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println(deviceId + message);
    }

    @Override
    public void setDefaultPriority(String priority) {
        System.out.println("Default Priority: " + priority);
    }
}

     class EmailNotification implements NotificationService {
          String emailAddress;

        public EmailNotification(String emailAddress) {
            this.emailAddress = emailAddress;


        }
        @Override
        public void sendNotification(String message) {
            System.out.println("Email Notification: " + emailAddress + ": " + message);
        }
    }
    class SMSNotification implements NotificationService{
        @Override
        public void sendNotification(String message0) {
            System.out.println("SMS Notification: " + message0);
        }
    }


