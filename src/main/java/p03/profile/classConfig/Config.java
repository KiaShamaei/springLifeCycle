package p03.profile.classConfig;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
//@Profile("home")
@PropertySource("classpath:application.properties")
public class Config {
    @Autowired
    Environment environment;
    @Bean
    @Profile("one")
    public BeanOne beanOne(){
        return new BeanOne();
    }
    @Bean
    @Profile("two")
    public BeanTwo beanTwo(){
        return new BeanTwo(environment.getProperty("user"));
    }

}
