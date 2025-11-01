package topic2_ioc_di.task2.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("topic2_ioc_di.task2.annotation");
        context.refresh();
        GreetingService greetingService = context.getBean(GreetingService.class);
        greetingService.greet();
        context.close();
    }
}
