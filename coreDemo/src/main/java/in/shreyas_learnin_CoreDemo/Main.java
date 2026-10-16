package in.shreyas_learnin_CoreDemo;

import in.shreyas_learnin_CoreDemo.NotificationService.EmailService;
import in.shreyas_learnin_CoreDemo.NotificationService.Notification;
import in.shreyas_learnin_CoreDemo.NotificationService.PopUp_Service;
import in.shreyas_learnin_CoreDemo.NotificationService.SMS_Service;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void main() {

        Notification notify1 = new EmailService();
        Notification notify2 = new SMS_Service();
        Notification notify3 = new PopUp_Service();

        OrderService order1 = new OrderService(notify1);
        OrderService order2 = new OrderService(notify2);
        OrderService order3 = new OrderService(notify3);
        order1.placeOrder();
        order2.placeOrder();
        order3.placeOrder();


        }
    }

