package p05.event.CustomEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class CustomEventPublisher1  {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    //caller event
    public void sendSms(String message){
        System.out.println("eventcall");
        var cus = new CustomEvent(this);
        applicationEventPublisher.publishEvent(cus);
    }
}
