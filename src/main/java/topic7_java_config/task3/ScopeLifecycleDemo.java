package topic7_java_config.task3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeLifecycleDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        TaskProcessor tp1 = context.getBean(TaskProcessor.class);
        TaskProcessor tp2 = context.getBean(TaskProcessor.class);
        tp1.execute();
        tp2.execute();
        context.close();
    }
}
