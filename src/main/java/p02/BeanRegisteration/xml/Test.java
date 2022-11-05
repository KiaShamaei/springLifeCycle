package p02.BeanRegisteration.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context = new GenericXmlApplicationContext("file:D:\\springClass\\lifeCycle\\src\\main\\java\\p02\\BeanRegisteration\\xml\\config.xml");
        var beanUse = context.getBean(UseMessageDigest.class);
        beanUse.digset("Hello ooooooo");
    }
}
