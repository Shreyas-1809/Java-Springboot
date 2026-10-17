package in.shreyas_learnin_CoreDemo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")

public class A {

    public A()
    {
        System.out.println(" Object of A is created");
    }

}
