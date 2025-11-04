package topic3_bean_lifecycle.task5;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class InterfaceLifecycleBean implements InitializingBean, DisposableBean {
    public InterfaceLifecycleBean() {
        System.out.println("InterfaceLifecycleBean: Constructor called");
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InterfaceLifecycleBean: afterPropertiesSet called");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("InterfaceLifecycleBean: destroy called");
    }
}
