package topic8_value_injection.task5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ValueExpressionDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AppProperties appProperties = context.getBean(AppProperties.class);
        appProperties.printValues();
        context.close();
    }
}
