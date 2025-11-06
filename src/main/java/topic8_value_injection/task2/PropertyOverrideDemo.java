package topic8_value_injection.task2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropertyOverrideDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AppProperties appProperties = context.getBean(AppProperties.class);
        appProperties.showConfig();
        context.close();
    }
}
