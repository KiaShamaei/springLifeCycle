package p05.event.CustomEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class CustomEventPublisher2 {
    @Autowired
    private ApplicationContext applicationContext;

    public void sendSms(){
        CustomEvent cu = new CustomEvent(this);
        applicationContext.publishEvent(cu);
    }
}
