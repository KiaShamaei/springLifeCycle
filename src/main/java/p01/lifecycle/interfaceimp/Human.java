package p01.lifecycle.interfaceimp;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Human implements DisposableBean , InitializingBean {
    public Human() {
        System.out.println("this is from human ...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("this is from human destroy...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("this is from human init ...");

    }
}
