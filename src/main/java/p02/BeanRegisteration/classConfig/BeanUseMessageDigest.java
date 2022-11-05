package p02.BeanRegisteration.classConfig;

import java.security.MessageDigest;

public class BeanUseMessageDigest {
    private MessageDigest dig1;
    private MessageDigest dig2;

    public MessageDigest getDig1() {
        return dig1;
    }

    public void setDig1(MessageDigest dig1) {
        this.dig1 = dig1;
    }

    public MessageDigest getDig2() {
        return dig2;
    }

    public void setDig2(MessageDigest dig2) {
        this.dig2 = dig2;
    }
    public void digster (String message){
        System.out.println("this message call for : " +  message);
        digster(dig1 , message);
        digster(dig2 , message);

    }
    private void digster(MessageDigest digest , String msg){
        System.out.println(digest.getAlgorithm());
        byte[] byteMsg = msg.getBytes();
        byte[] hash = digest.digest(byteMsg);
        System.out.println(hash);
    }
}
