package topic3_bean_lifecycle.task1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifecycleAnnotationDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        LifecycleDemoBean bean = context.getBean(LifecycleDemoBean.class);
        context.close();
    }
}
