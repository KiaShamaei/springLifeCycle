package p03.profile.classConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {


        var context = new AnnotationConfigApplicationContext(Config.class);



    }
}
