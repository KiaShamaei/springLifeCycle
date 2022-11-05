package p01.injectPrototypeInSingleton.withAopProxyXml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context = new GenericXmlApplicationContext("file:D:\\springClass\\lifeCycle\\src\\main\\java\\p01\\injectPrototypeInSingleton\\withAopProxyXml\\config.xml");
        var beanSingleTone = context.getBean(SingleTon.class);
        System.out.println(beanSingleTone.getProtypeBean());
        System.out.println(beanSingleTone.getProtypeBean());

    }
}
