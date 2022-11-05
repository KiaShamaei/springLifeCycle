package p01.scopeWithLazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
//@Scope("prototype")
//@Lazy
public class BeanOne {
    public BeanOne() {
        System.out.println("this is from bean one ");
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
