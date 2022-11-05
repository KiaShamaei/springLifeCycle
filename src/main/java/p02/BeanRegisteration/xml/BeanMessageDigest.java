package p02.BeanRegisteration.xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

import java.security.MessageDigest;

public class BeanMessageDigest implements InitializingBean, FactoryBean<MessageDigest> {
    private  String algorithmName = "md5";
    private MessageDigest messageDigest = null;

    public BeanMessageDigest() {
    }

    public MessageDigest getMessageDigest() {
        return messageDigest;
    }

    public void setMessageDigest(MessageDigest messageDigest) {
        this.messageDigest = messageDigest;
    }

    public String getAlgorithmName() {
        return algorithmName;
    }

    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
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
        this.messageDigest = MessageDigest.getInstance(algorithmName);

    }
}
