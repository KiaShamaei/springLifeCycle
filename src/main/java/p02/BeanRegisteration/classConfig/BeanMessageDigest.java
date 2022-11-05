package p02.BeanRegisteration.classConfig;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

import java.security.MessageDigest;

public class BeanMessageDigest implements FactoryBean<MessageDigest> , InitializingBean {
    private  MessageDigest messageDigest ;
    private String algorithm = "md5";

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public MessageDigest getObject() throws Exception {
        return messageDigest;
    }

    @Override
    public Class<MessageDigest> getObjectType() {
        return MessageDigest.class;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.messageDigest= MessageDigest.getInstance(algorithm);

    }
}
