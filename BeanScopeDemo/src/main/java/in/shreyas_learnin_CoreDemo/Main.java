package in.shreyas_learnin_CoreDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        ApplicationContext context = new AnnotationConfigApplicationContext(appconfig.class);

        // Singleton scope case
        orderservice order = context.getBean(orderservice.class);
        orderservice order2 = context.getBean(orderservice.class);

        System.out.println(order==order2);

        // Prototype scope case

       A order3 = context.getBean(A.class);
       A order4 = context.getBean(A.class);

       System.out.println(order3==order4);



    }
}
