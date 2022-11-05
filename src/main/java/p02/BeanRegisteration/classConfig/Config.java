package p02.BeanRegisteration.classConfig;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import p02.BeanRegisteration.xml.BeanMessageDigest;
@Configuration
public class Config {
    @Bean
    @Qualifier("beanMessageDigest")
    public BeanMessageDigest beanMessageDigest(){
        var bean = new BeanMessageDigest();
        return bean;
    }
    @Bean
    @Qualifier("beanMessageDigestSHA")
    public BeanMessageDigest beanMessageDigestSHA(){
        var bean = new BeanMessageDigest();
        bean.setAlgorithmName("SHA1");
        return bean;
    }
    @Bean
    public BeanUseMessageDigest beanUseMessageDigest() throws Exception {
      var bean = new BeanUseMessageDigest();
      bean.setDig2(beanMessageDigest().getObject());
      bean.setDig1(beanMessageDigestSHA().getObject());
      return bean;
    }
}
