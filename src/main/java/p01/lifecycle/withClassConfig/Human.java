package p01.lifecycle.withClassConfig;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Human {
    public Human() {
        System.out.println("this is from human ...");
    }

    public void myInit()  {
        System.out.println("this is from human prePostconstruct...");
    }

    public void myDestroy(){
        System.out.println("this is from human PreDestroy ...");

    }
}
