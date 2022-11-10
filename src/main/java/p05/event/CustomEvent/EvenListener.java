package p05.event.CustomEvent;

import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class EvenListener implements ApplicationListener<CustomEvent> {

    @Override
    @Async
    public void onApplicationEvent(CustomEvent event) {
        System.out.println("event listen");
        System.out.println(event.toString());
    }
}
