package p03.profile.InterNationalXml;

import org.springframework.context.MessageSource;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Locale;


public class Test {
    public static void main(String[] args) {
        MessageSource messageSource = new GenericXmlApplicationContext("file:D:\\springClass\\lifeCycle\\src\\main\\java\\p03\\profile\\InterNationalXml\\config.xml");
        System.out.println(messageSource.getMessage("name" , null , "kir" , new Locale("fa")));
        System.out.println(messageSource.getMessage("name" , null , "asghaar" , new Locale("en")));
    }
}
