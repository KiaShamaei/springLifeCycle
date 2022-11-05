package p01.injectPrototypeInSingleton.withAbstract;


import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context =new GenericXmlApplicationContext("file:D:\\springClass\\lifeCycle\\src\\main\\java\\p01\\injectPrototypeInSingleton\\withAbstract\\config.xml");
        System.out.println(context.getBean(SingletonBean.class));
        System.out.println(context.getBean(SingletonBean.class).getPrototypeBean());
        System.out.println(context.getBean(SingletonBean.class).getPrototypeBean());
    }
}
