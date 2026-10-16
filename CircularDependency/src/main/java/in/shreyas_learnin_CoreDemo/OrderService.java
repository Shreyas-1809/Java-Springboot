package in.shreyas_learnin_CoreDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class OrderService {

    @Autowired
    private PaymentService payment; // field injection is used to resolve a circular dependency

//    public OrderService(PaymentService payment)
//    {
//        this.payment = payment;
//    }

    public void Placeorder()
    {
        payment.pay();
        System.out.println("Order is placed successfully");
    }

    public void details()
    {
        System.out.println("Details of the order");
    }

}
