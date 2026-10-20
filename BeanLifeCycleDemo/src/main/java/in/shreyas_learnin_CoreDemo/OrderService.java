package in.shreyas_learnin_CoreDemo;


import org.springframework.context.PayloadApplicationEvent;
import org.springframework.stereotype.Component;

//@Component
public class OrderService {

    private PaymentService payment;

    public OrderService(PaymentService payment)
    {
        this.payment = payment;
        System.out.println("OrderService setup");
    }

    public void order()
    {
        System.out.println("Order is taken");
    }
}
