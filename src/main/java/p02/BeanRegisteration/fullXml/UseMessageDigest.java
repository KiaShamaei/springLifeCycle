package p02.BeanRegisteration.fullXml;

import java.security.MessageDigest;

public class UseMessageDigest {
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
    public void digset(String msg){
        System.out.println( "this from useage ... " +msg);
        digset(msg , dig1);
        digset(msg , dig2);


    }
    public void digset(String msg , MessageDigest dig){
        System.out.println("this is use this algorithm :  " + dig.getAlgorithm());
        byte[] bytesMsg = msg.getBytes();
        byte[] msgAfterDigset = dig.digest(bytesMsg);
        System.out.println(msgAfterDigset);
    }
}
