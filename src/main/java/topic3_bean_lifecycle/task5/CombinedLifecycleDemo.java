package topic3_bean_lifecycle.task5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CombinedLifecycleDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ConfigLifecycleBean bean = context.getBean(ConfigLifecycleBean.class);
        context.close();
    }
}
