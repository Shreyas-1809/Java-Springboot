package in.shreyas_learnin_CoreDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);

        Appconfig cnf = context.getBean(Appconfig.class);

        //CartService ct = context.getBean(CartService.class);
       //cartservice2 ct2 = context.getBean(cartservice2.class);

        //ct2.display(1);

        cartservice3 ct3 = context.getBean(cartservice3.class);
        ct3.display(2 );
    }
    }
