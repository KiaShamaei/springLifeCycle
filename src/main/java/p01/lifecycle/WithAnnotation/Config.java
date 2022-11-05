package p01.lifecycle.WithAnnotation;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"p01.lifecycle.WithAnnotation"})
public class Config {
}
