package topic7_java_config.task1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        GreetingService greetingService = context.getBean(GreetingService.class);
        greetingService.greet();
        context.close();
    }
}
