package topic8_value_injection.task4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DefaultValueDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AppProperties appProps = context.getBean(AppProperties.class);
        appProps.printCollections();
        context.close();
    }
}
