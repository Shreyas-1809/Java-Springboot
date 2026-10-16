package in.shreyas_learnin_CoreDemo.Payments;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cp")
public class CardPayments implements PaymentService {

    @Override
    public void pay() {
        System.out.println("Payment is done using Card");

    }
}
