package topic10_spel.task4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpELBeanAccessDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AppProperties appProperties = context.getBean(AppProperties.class);
        appProperties.printValues();
        context.close();
    }
}
