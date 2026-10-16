package in.shreyas_learnin_CoreDemo.NotificationService;

public class SMS_Service implements Notification {
    @Override
    public void SendNotification()
    {
        System.out.println("SMS Notification is sent");
    }
}
