package topic5_component_scanning.task1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        GreetingService greetingService = context.getBean(GreetingService.class);
        greetingService.greet();
        context.close();
    }
}
