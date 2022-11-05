package p01.scope.ClassConfig;


import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {
    @Bean("dao1")
//    @Scope("prototype")
//    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ProductDao productDao(){
        return  new ProductDao();
    }
    @Bean("serv1")
    public ProductService productService(ProductDao dao1){
        return new ProductService(dao1);
    }
    @Bean("serv2")
    public ProductService productService2(){
        return new ProductService(productDao());
    }
}
