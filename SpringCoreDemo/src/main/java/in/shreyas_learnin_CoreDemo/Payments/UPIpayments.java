package in.shreyas_learnin_CoreDemo.Payments;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("up")
public class UPIpayments implements PaymentService {


    @Override
    public void pay() {
        System.out.println("Payment is done using UPI");

    }
}
