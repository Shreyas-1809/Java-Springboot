
/*package in.shreyas_learnin_CoreDemo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CartService implements InitializingBean {

    Map<Integer,String> mp;

    public CartService()
    {
        mp = new HashMap<>();
        System.out.println("CartSevice Constructor is called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing callbacks done");
        mp.put(1,"Shreyas");
        mp.put(2,"Shrey");
    }

    public void display(int key)
    {
        System.out.println(mp.get(key));
    }

}
*/