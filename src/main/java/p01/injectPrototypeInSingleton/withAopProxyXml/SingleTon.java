package p01.injectPrototypeInSingleton.withAopProxyXml;

public class SingleTon {
    private ProtypeBean protypeBean;

    public SingleTon(ProtypeBean protypeBean) {
        this.protypeBean = protypeBean;
    }

    public ProtypeBean getProtypeBean() {
        return protypeBean;
    }

    public void setProtypeBean(ProtypeBean protypeBean) {
        this.protypeBean = protypeBean;
    }
}
