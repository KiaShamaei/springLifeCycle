package p01.lifecycle.methodBase;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Human  {
    public Human() {
        System.out.println("this is from human ...");
    }


    public void myInit()  {
        System.out.println("this is from human destroy...");
    }


    public void myDestroy(){
        System.out.println("this is from human init ...");

    }
}
