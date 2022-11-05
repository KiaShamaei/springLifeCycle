package p01.lifecycle.contextAware;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Human {
    public Human() {
        System.out.println("this is from human ...");
    }


    @PostConstruct
    public void myInit()  {
        System.out.println("this is from human prePostconstruct...");
    }

    @PreDestroy
    public void myDestroy(){
        System.out.println("this is from human PreDestroy ...");

    }
}
