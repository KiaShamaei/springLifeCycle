package p01.injectPrototypeInSingleton.withApplicatioContextAware;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class Config {
    @Bean
    @Scope("prototype")
    public PrototypeBean prototypeBean(){
        return new PrototypeBean();
    }
    @Bean
    public SingletoneBean singletonBean(){
        return new SingletoneBean();
    }

}
