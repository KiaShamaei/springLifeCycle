package p01.scope.ClassConfig;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TestXml {
    public static void main(String[] args) {
        var context = new GenericXmlApplicationContext("file:D:\\springClass\\lifeCycle\\src\\main\\java\\p01\\scope\\ClassConfig\\config.xml");
        var bean1 = (ProductService)context.getBean("serv1");
        var bean2 = (ProductService)context.getBean("serv2");
        System.out.println(bean2.getProductDao());
        System.out.println(bean1.getProductDao());
    }
}
