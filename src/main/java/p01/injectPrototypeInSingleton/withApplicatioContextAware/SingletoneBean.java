package p01.injectPrototypeInSingleton.withApplicatioContextAware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SingletoneBean  implements ApplicationContextAware {
    private PrototypeBean prototypeBean;
    private ApplicationContext applicationContext ;

    public PrototypeBean getPrototypeBean() {
        this.prototypeBean = (PrototypeBean) applicationContext.getBean(PrototypeBean.class);
        return prototypeBean;
    }

    public void setPrototypeBean(PrototypeBean prototypeBean) {
        this.prototypeBean = prototypeBean;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
// in this sitation never prototype behavior happened ----------
//    public SingletoneBean(PrototypeBean prototypeBean) {
//        this.prototypeBean = prototypeBean;
//    }

}
