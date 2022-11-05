package p01.lifecycle.beanNameAware;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context = new GenericXmlApplicationContext("file:D:\\springClass\\lifeCycle\\src\\main\\java\\p01\\lifecycle\\beanNameAware\\config.xml");
        var player = context.getBean(Player.class);
        player.play();
    }
}
