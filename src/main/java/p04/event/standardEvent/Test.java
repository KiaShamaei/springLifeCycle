package p04.event.standardEvent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Timer;
import java.util.TimerTask;

public class Test {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        context.start();
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                context.stop();
                context.close();
            }
        }, 3000L);


    }
}
