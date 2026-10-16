package in.shreyas_learnin_CoreDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    static void main() {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Orderservice order = context.getBean(Orderservice.class);
        order.order();

       // PaymentService payment = context.getBean(PaymentService.class);
       //    payment.pay();
    }
}
