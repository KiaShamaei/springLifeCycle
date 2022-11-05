package p01.scope.ClassConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        var serv1 = (ProductService) context.getBean("serv1");
        var serv2 = (ProductService) context.getBean("serv2");
        //in singleton both obj ref same
        System.out.println(serv1.getProductDao());
        System.out.println(serv2.getProductDao());

    }
}
