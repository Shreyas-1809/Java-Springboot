package in.shreyas_learnin_CoreDemo;


import org.springframework.stereotype.Component;

//@Component
public class PaymentService {
    public PaymentService()
    {
        System.out.println("PaymentService setup");
    }

    public void pay()
    {
        System.out.println("payment is done");
    }
}

