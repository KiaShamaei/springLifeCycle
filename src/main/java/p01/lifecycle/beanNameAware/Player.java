package p01.lifecycle.beanNameAware;

import org.springframework.beans.factory.BeanNameAware;

public class Player implements BeanNameAware {
    private String  name ;

    @Override
    public void setBeanName(String name) {
        this.name = name;
    }
    public Player(){
        System.out.println("this is name of bean " + name);
    }
    public void play(){
        System.out.println("this is name of bean " + name);
    }
}
