package in.shreyas_learnin_CoreDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component

public class PaymentService {

    @Autowired
    private OrderService order; // field ijection is used to resolve a circular dependency

//    public PaymentService(OrderService order)
//    {
//        this.order = order;
//    }


    public void pay()
    {
        System.out.println("Payment is done");

        order.details();
    }
}
