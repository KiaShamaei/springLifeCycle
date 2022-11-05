package p02.BeanRegisteration.classConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        var bean = context.getBean(BeanUseMessageDigest.class);
        bean.digster("hello");
    }

}
