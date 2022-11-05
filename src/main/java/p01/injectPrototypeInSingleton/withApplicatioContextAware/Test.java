package p01.injectPrototypeInSingleton.withApplicatioContextAware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        System.out.println(context.getBean(SingletoneBean.class));
        System.out.println(context.getBean(SingletoneBean.class).getPrototypeBean());
        System.out.println(context.getBean(SingletoneBean.class).getPrototypeBean());
    }
}
