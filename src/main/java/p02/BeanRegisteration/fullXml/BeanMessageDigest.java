package p02.BeanRegisteration.fullXml;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BeanMessageDigest {
    private  String algorithmName = "md5";


    public String getAlgorithmName() {
        return algorithmName;
    }

    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }
    public MessageDigest creatInstance() throws NoSuchAlgorithmException {
        return MessageDigest.getInstance(algorithmName);
    }


}
