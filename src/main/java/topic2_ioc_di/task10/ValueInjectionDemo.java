package topic2_ioc_di.task10;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ValueInjectionDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("topic2_ioc_di.task10");
        context.refresh();
        EnvironmentInfo environmentInfo = context.getBean(EnvironmentInfo.class);
        environmentInfo.printEnvironmentDetails();
        context.close();
    }
}
