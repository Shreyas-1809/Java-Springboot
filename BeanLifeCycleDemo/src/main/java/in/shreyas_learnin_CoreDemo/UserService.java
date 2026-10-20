package in.shreyas_learnin_CoreDemo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

//@Component("userBean") // we can custom set the name of bean by like this
public class UserService implements BeanNameAware {

    public UserService()
    {
        System.out.println("UserServie setup");
    }


    @Override
    public void setBeanName(String name) { // callback functions - th functions which the spring call by itself and no users calls it
        System.out.println("Bean Name is "+name);
    }
}
