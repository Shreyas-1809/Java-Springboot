package in.shreyas_learnin_CoreDemo;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class cartservice3 {
Map<Integer,String> mp;

    public cartservice3()
    {
        mp = new HashMap<>();
        System.out.println("CartSevice3 Constructor is called");
    }
    @PostConstruct // here we put new dependecy , use jakarta.annotation.api dependency
    public void start()
    {
        System.out.println("Initializing callbacks done of 2");
        mp.put(1,"Shreyas");
        mp.put(2,"Shrey");
    }

    public void display(int key)
    {
        System.out.println(mp.get(key));
    }

}

