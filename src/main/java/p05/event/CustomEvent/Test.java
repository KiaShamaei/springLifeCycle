package p05.event.CustomEvent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
//        var publisher = context.getBean(CustomEventPublisher1.class);
//        var publisher = context.getBean(CustomEventPublisher2.class);
        var publisher = context.getBean(CustomEventPublisher3.class);

        publisher.sendSms();
    }
}
