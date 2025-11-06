package topic8_value_injection.task1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ValueInjectionDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AppProperties appProperties = context.getBean(AppProperties.class);
        appProperties.printProperties();
        context.close();
    }
}
