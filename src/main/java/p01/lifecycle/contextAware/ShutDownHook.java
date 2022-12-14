package p01.lifecycle.contextAware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ShutDownHook implements ApplicationContextAware {
    ApplicationContext context;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
        if(context instanceof GenericApplicationContext){
            ((GenericApplicationContext) context).registerShutdownHook();
        }
    }
}
