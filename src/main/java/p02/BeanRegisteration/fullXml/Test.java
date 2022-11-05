package p02.BeanRegisteration.fullXml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context = new GenericXmlApplicationContext("file:D:\\springClass\\lifeCycle\\src\\main\\java\\p02\\BeanRegisteration\\fullXml\\config.xml");
        var bean =context.getBean(UseMessageDigest.class);
        bean.digset("hello");
    }
}
