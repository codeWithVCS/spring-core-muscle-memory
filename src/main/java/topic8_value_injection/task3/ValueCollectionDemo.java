package topic8_value_injection.task3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ValueCollectionDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AppProperties appProperties = context.getBean(AppProperties.class);
        appProperties.printCollections();
        context.close();
    }
}
