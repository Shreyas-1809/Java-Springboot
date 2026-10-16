package in.shreyas_learnin_CoreDemo.NotificationService;

public class EmailService implements Notification {

    @Override
    public void SendNotification()
    {
        System.out.println("Email Notification sent");
    }
}
