package in.shreyas_learnin_CoreDemo;

import in.shreyas_learnin_CoreDemo.NotificationService.EmailService;
import in.shreyas_learnin_CoreDemo.NotificationService.Notification;
import in.shreyas_learnin_CoreDemo.NotificationService.PopUp_Service;
import in.shreyas_learnin_CoreDemo.NotificationService.SMS_Service;

public class OrderService {// here we can say that orderservice is dependent on the object

    Notification notify;

    public OrderService(Notification noti)
    {
        this.notify = noti;
    }

    public void placeOrder()
    {
        System.out.println("Order is Placed");
        notify.SendNotification();

    }
}
