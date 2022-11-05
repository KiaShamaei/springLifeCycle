package p01.lifecycle.methodBase;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        var context = new GenericXmlApplicationContext();
        context.load("file:D:\\springClass\\lifeCycle\\src\\main\\java\\p01\\lifecycle\\methodBase\\config.xml");
        context.refresh();
        context.close();
    }
}
