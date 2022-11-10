package p03.profile.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context = new GenericXmlApplicationContext("file:D:\\springClass\\lifeCycle\\src\\main\\java\\p03\\profile\\xml\\config-home.xml");
       var bean = (FoodProvider) context.getBean("food");
       bean.make();
    }
}
