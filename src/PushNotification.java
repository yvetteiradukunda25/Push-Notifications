public class PushNotification implements NotificationService{
    private String deviceId;
    public PushNotification(String deviceId) {
        this.deviceId = deviceId;
    }
    @Override
    public void sendNotification(String message){
        System.out.println(deviceId + message);
    }
    @Override
    public void sendNotification(String priority){
        System.out.println(priority);
    }
}
