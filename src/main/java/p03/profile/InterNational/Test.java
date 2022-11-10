package p03.profile.InterNational;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Locale;

public class Test {
    public static void main(String[] args) {
        var context =new AnnotationConfigApplicationContext(Config.class);
        MessageSource source = new AnnotationConfigApplicationContext(Config.class);
        String messageFa = source.getMessage("name",null,"default",new Locale("fa"));
        String messageEn = context.getMessage("name" , null,"default", new Locale("en"));
        System.out.println(messageEn);
        System.out.println(messageFa);
    }
}
