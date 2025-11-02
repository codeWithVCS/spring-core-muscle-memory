package topic3_bean_lifecycle.task2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MultiBeanLifecycleDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ApplicationManager applicationManager = context.getBean(ApplicationManager.class);
        context.close();
    }
}
