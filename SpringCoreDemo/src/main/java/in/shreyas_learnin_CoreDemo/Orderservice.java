package in.shreyas_learnin_CoreDemo;

import in.shreyas_learnin_CoreDemo.Payments.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Orderservice {

    private PaymentService payment;

@Autowired
public Orderservice(@Qualifier("cp") PaymentService payment)
{
    this.payment = payment;
}


    public void order()
    {
        payment.pay();
        System.out.println("Order is placed");
    }
}
